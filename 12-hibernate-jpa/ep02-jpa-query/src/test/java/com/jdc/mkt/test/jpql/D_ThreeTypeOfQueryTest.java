package com.jdc.mkt.test.jpql;

import java.time.LocalDate;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.Product;
import com.jdc.mkt.entity.VoucherDetail;
import com.jdc.mkt.entity.VoucherDetail_;
import com.jdc.mkt.entity.Voucher_;
import com.jdc.mkt.test.JpaFactory;

public class D_ThreeTypeOfQueryTest extends JpaFactory{

	@Test
	// select vd.product from VoucherDetail vd where vd.voucher.saleDate between :from and :to
	void selectProductByVoucherDateWithCriteria() {
		var cb = em.getCriteriaBuilder();
		
		//create query with predicate type
		var cq = cb.createQuery(Product.class);
		
		//from VoucherDetail vd
		var root = cq.from(VoucherDetail.class);
		
		//select vd from VoucherDetail vd
		cq.select(root.get(VoucherDetail_.product));
		
		var predicate = cb.between(root.get(VoucherDetail_.voucher).get(Voucher_.saleDate), 
				LocalDate.of(2024, 10, 01), LocalDate.of(2024, 10, 03));
		
		//where vd.voucher.saleDate between :from and :to
		cq.where(predicate);
		
		var query = em.createQuery(cq);
		
		System.out.println("Size :::: "+query.getResultList().size());
	}

	@Test
	@Disabled
	void selectProductByVoucherDateWithNative() {
		var query = em.createNativeQuery("""
				select * from product_tbl p
				join voucher_detail_tbl vd on vd.product_id = p.id
				join voucher_tbl v on vd.voucher_id = v.id
				where v.sale_date between :from and :to
				""");
		query.setParameter("from", LocalDate.of(2024, 10, 01));
		query.setParameter("to", LocalDate.of(2024, 10, 03));
		
		System.out.println("Size :::: "+query.getResultList().size());
	}
	
	@Test
	@Disabled
	void selectProductByVoucherDateWithJpql() {
		var query = em.createQuery("""
				select p from Product p
				join p.voucherDetails vd
				where vd.voucher.saleDate between :from and :to
				""");
		query.setParameter("from", LocalDate.of(2024, 10, 01));
		query.setParameter("to", LocalDate.of(2024, 10, 03));
		
		System.out.println("Size :::: "+query.getResultList().size());
	}
}

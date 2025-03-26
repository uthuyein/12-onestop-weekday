package com.jdc.mkt.test.jpql;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.jdc.mkt.dto.SelectProductNameSaleDateQty;
import com.jdc.mkt.test.JpaFactory;

public class JoinOperatorTest extends JpaFactory{
	
	@ParameterizedTest
	@ValueSource(strings = "Hlaing")
	void selectProductSaleDateQtyByTownship(String township) {
		var query = em.createQuery("""
				select new com.jdc.mkt.dto.SelectProductNameSaleDateQty(
				vd.product.name,vd.voucher.saleDate,sum(vd.qty)) from VoucherDetail vd
				group by vd.product.name,vd.voucher.saleDate
				order by vd.product.name asc
				""",SelectProductNameSaleDateQty.class);
		query.getResultList().forEach(dto -> System.out.println(dto.name()+"\t"+dto.saleDate()+"\t"+dto.qty()));
	}
	
	@Disabled
	@ParameterizedTest
	@ValueSource(strings = "Hlaing")
	void selectProductByTownship(String township) {
		var query = em.createQuery("""
				select distinct vd.product.name from VoucherDetail vd
				where vd.voucher.customer.address.township = :township
				""",String.class);
		query.setParameter("township", township);
		query.getResultList().forEach(s -> System.out.println(s));
	}

	@Disabled
	@ParameterizedTest
	@CsvSource(delimiter = ':',value = {
			"Boss:7"
	})
	void countProductFromSaleDetail(String name,long res) {
		var query = em.createQuery("select sum(vd.qty) from VoucherDetail vd where vd.product.name = :name",Long.class);
		query.setParameter("name", name);
		assertEquals(res, query.getSingleResult());
	}
	
	@Disabled
	@ParameterizedTest
	@CsvSource(delimiter = ':',value = {
			"Boss"
	})
	void selectSaleDatefromVoucherByProduct(String name) {
		var query = em.createQuery("""
				select v.saleDate from Voucher v join v.voucherDetails vd
				where vd.product.name = :name
				""",LocalDate.class);
		query.setParameter("name", name);
		query.getResultList().forEach(d -> System.out.println(d));
	}
}

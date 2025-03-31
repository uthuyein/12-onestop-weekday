package com.jdc.mkt.test.jpql;

import org.junit.jupiter.api.Test;

import com.jdc.mkt.dto.SearchVoucherDetails;
import com.jdc.mkt.dto.SelectVoucherDetailsInfo;
import com.jdc.mkt.entity.VoucherDetail;
import com.jdc.mkt.test.JpaFactory;

public class G_DynamicSearchWithProjectionTest extends JpaFactory{

	@Test
	void selectWithProjection() {
		var cb = em.getCriteriaBuilder();
		var cq = cb.createQuery(SelectVoucherDetailsInfo.class);
		
		var root = cq.from(VoucherDetail.class);
		
		var search = new SearchVoucherDetails("Boss", null, 0);
		
		SelectVoucherDetailsInfo.select(cq, root);
		cq.where(search.where(cb, root));
		
		var query = em.createQuery(cq);
		for(SelectVoucherDetailsInfo info : query.getResultList()) {
			System.out.println(info.categoryName()+"\t"+info.productName()+"\t"+info.qty()+"\t"+info.saleDate());
		}
		
		
	}
}

package com.jdc.mkt.test.jpql;

import org.junit.jupiter.api.Test;

import com.jdc.mkt.dto.SelectCategoryProductSaleDateQty;
import com.jdc.mkt.entity.VoucherDetail;
import com.jdc.mkt.test.JpaFactory;

public class G_DynamicSearchWithProjectionTest extends JpaFactory{

	@Test
	void selectWithProjection() {
		var cb = em.getCriteriaBuilder();
		var cq = cb.createQuery(SelectCategoryProductSaleDateQty.class);
		
		var root = cq.from(VoucherDetail.class);
		
		var search = new SelectCategoryProductSaleDateQty("Boss", null, 0);
		
		cq.multiselect(root);
		cq.where(search.where(cb, root));
		
		var query = em.createQuery(cq);
		System.out.println("Size :::"+query.getResultList().size());
		
	}
}

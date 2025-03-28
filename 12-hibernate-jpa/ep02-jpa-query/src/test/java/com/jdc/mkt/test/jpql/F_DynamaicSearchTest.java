package com.jdc.mkt.test.jpql;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.mkt.entity.Category_;
import com.jdc.mkt.entity.Product;
import com.jdc.mkt.entity.Product_;
import com.jdc.mkt.test.JpaFactory;

import jakarta.persistence.criteria.Predicate;

public class F_DynamaicSearchTest extends JpaFactory{
	
	
	@ParameterizedTest
	@CsvSource(delimiter = ':',value = {
			"Boss: : ",
			"Boss:Wallet: ",
			"Boss:Wallet:true"
	})
	void searchProductBy(String name, String category, Boolean active) {
	//	searchProductByWithJpql(name, category, active);
		searchProductByWithCateria(name, category, active);
		
	}
	
	void searchProductByWithCateria(String name, String category, Boolean active) {
		var cb = em.getCriteriaBuilder();
		var cq = cb.createQuery(Product.class);
		List<Predicate> list = new ArrayList<>();
		
		var root = cq.from(Product.class);		
				
		if(null != name && !name.isEmpty()) {
			 list.add(cb.and(cb.equal(root.get(Product_.name), name)));
		}
		
		if(null != category && !category.isEmpty()) {
			list.add(cb.and(cb.equal(root.get(Product_.category).get(Category_.name), category)));
		}
		
		if(null != active) {
			list.add(cb.and(cb.equal(root.get(Product_.active), active)));
		}
		var array = list.toArray(new Predicate[list.size()]);
		
		cq.select(root);
		cq.where(array);
		var query = em.createQuery(cq);
		System.out.println("Size ::: "+query.getResultList().size());
	}

	
	void searchProductByWithJpql(String name, String category, Boolean active) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		var sb =  new StringBuilder("select p from Product p where 1=1 ");
		
		if(null != name && !name.isEmpty()) {
			sb.append(" and p.name = :name ");
			map.put("name", name);
		}
		
		if(null != category && !category.isEmpty()) {
			sb.append(" and p.category.name = :category");
			map.put("category", category);
		}
		
		if(null != active) {
			sb.append(" and p.active = :active");
			map.put("active", active);
		}
		var query = em.createQuery(sb.toString(),Product.class);
		
		for(Map.Entry<String,Object> entry :map.entrySet()) {
			query.setParameter(entry.getKey(), entry.getValue());
		}
		
		System.out.println("Size :::: "+query.getResultList().size());
		
	}

	
}

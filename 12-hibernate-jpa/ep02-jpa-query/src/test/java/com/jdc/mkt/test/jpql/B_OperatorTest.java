package com.jdc.mkt.test.jpql;

import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.Product;
import com.jdc.mkt.test.JpaFactory;

public class B_OperatorTest extends JpaFactory{

	@Test
	void test() {
		var query1 = em.createQuery("select  p from Product p where p.price >= ?1 order by p.price desc",Product.class);
		query1.setParameter(1, 40000);
		query1.getResultStream().forEach(p -> System.out.println(p.getName()+"\t"+p.getPrice()));
		
		var query2 = em.createQuery("select p from Product p where p.name in ('Boss','Adidas','Tommy')",Product.class);
		query2.getResultList().forEach(p -> System.out.println(p.getName()));
	}
}

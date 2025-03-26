package com.jdc.mkt.test.jpql;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.Customer;
import com.jdc.mkt.entity.Product;
import com.jdc.mkt.test.JpaFactory;

public class StaticVsDynamicQueryTest extends JpaFactory{
	
	@Test
	@Order(2)
	void staticQueryTest() {
		var nameWith = em.createNamedQuery("pWithBetween",Product.class);
		nameWith.setParameter("first", 45000.00);
		nameWith.setParameter("second", 65000.00);
		
		for(Product p :nameWith.getResultList()) {
			System.out.println(p.getName());
		}
		
		var productByCategory = em.createNamedQuery("selectProductByCategory",Product.class);
		productByCategory.setParameter("category", "Trouser");
		
		productByCategory.getResultStream().forEach(p -> System.out.println(p.getName()));
	}

	@Test
	@Disabled
	@Order(1)
	void dynamicQueryTest() {
		var nameWithIndexParam = em.createQuery("select c from Customer as c where lower(c.name) like lower(?1)",Customer.class);
		nameWithIndexParam.setParameter(1, "a".concat("%"));
		
		for(Customer c : nameWithIndexParam.getResultList()) {
			System.out.println(c.getName());
		}
		
		var countWithNameParam = em.createQuery("select count(c) from Customer c where lower(c.name) like lower(:name)",Long.class);
		countWithNameParam.setParameter("name", "s".concat("%"));
		var res = countWithNameParam.getSingleResult();
		
		System.out.println("Count :"+res);
		
		var cuWithCityName = em.createQuery("select c from Customer c where c.address.city = :city",Customer.class);
		cuWithCityName.setParameter("city", "Mandalay");
		
		for(Customer c : cuWithCityName.getResultList()) {
			System.out.println(c.getName());
		}
	}
}











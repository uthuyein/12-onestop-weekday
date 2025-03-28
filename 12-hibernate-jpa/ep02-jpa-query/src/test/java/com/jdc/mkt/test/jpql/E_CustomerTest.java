package com.jdc.mkt.test.jpql;

import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.Address_;
import com.jdc.mkt.entity.Customer;
import com.jdc.mkt.entity.Customer_;
import com.jdc.mkt.test.JpaFactory;

//select c from Customer c where c.address.city = :city
public class E_CustomerTest extends JpaFactory {

	@Test
	void selectCustomerByCityWithCriteria() {
		var cb = em.getCriteriaBuilder();
		
		var cq = cb.createQuery(Customer.class);
		
		var root = cq.from(Customer.class);
		
		cq.select(root);
		
		cq.where(
				cb.equal(cb.lower(root.get(Customer_.address).get(Address_.city)),
				"Mandalay".toLowerCase()));
		
		var query = em.createQuery(cq);
		System.out.println("Size :::: "+query.getResultList().size());
	}

	void selectCustomerByCityWithJpql() {

	}

	void selectCustomerByCityWithNative() {

	}
}

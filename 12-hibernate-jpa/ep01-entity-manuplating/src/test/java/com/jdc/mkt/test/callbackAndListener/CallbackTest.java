package com.jdc.mkt.test.callbackAndListener;

import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.Member;
import com.jdc.mkt.test.JpaFactory;

public class CallbackTest extends JpaFactory{

	@Test
	void memberTest() {
		var em = emf.createEntityManager();
		em.getTransaction().begin();
		var member = new Member("admin","admin@gmail.com","admin");
		em.persist(member);
		em.getTransaction().commit();
	}
}

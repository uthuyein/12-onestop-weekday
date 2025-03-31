package com.jdc.mkt.controller.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaFactory {

	private EntityManagerFactory emf;
	private EntityManager em;

	JpaFactory() {
		emf = Persistence.createEntityManagerFactory("servlet-with-criteria");
	}

	EntityManager getEm() {
		if (null == em) {
			em = emf.createEntityManager();
		}

		return em;
	}
	
	void closedEm() {
		if(null != em && em.isOpen())
			em.close();
	}

}

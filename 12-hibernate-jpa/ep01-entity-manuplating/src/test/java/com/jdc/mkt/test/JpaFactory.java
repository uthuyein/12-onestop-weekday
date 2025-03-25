package com.jdc.mkt.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@TestMethodOrder(OrderAnnotation.class)
public class JpaFactory {

	protected static EntityManagerFactory emf;
	
	@BeforeAll
	protected static void init() {
		emf = Persistence.createEntityManagerFactory("entity-manuplating");
	}
	
	@AfterAll
	protected static void closeEmf() {
		if(null != emf && emf.isOpen())
			emf.close();
	}
}

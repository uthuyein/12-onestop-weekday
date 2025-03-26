package com.jdc.mkt.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@TestMethodOrder(OrderAnnotation.class)
public class JpaFactory {

	protected static EntityManagerFactory emf;

	@BeforeAll
	protected static void init() {
		emf = Persistence.createEntityManagerFactory("jpa-query");
	}

	@AfterAll
	protected static void close() {
		if(null != emf && emf.isOpen())
			emf.close();
	}
	
	@Test
	void test() {
		
	}
}

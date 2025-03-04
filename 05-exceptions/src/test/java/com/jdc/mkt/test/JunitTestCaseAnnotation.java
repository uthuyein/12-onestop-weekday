package com.jdc.mkt.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class JunitTestCaseAnnotation {

	@BeforeAll
	static void beforeAll() {
		System.out.println("================= Before All ====================");
	}
	@AfterAll
	static void afterAll() {
		System.out.println("================= After All ====================");
	}
	@BeforeEach
	void beforeEach() {
		System.out.println("          ===== Before Each =====          ");
	}
	@AfterEach
	void afterEach() {
		System.out.println("          ===== After Each =====          ");
	}
	
	@Test
	@Order(2)
	void testTwo() {
		System.out.println("                Test Two                ");
	}
	
	@Test
	@Order(3)
	void testOne() {
		System.out.println("                Test One                ");
	}
	
	@Test
	@Order(1)
	void testThree() {
		System.out.println("                Test Three              ");
	}
}

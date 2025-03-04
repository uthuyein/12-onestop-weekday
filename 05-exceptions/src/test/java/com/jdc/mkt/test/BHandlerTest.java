package com.jdc.mkt.test;

import org.junit.jupiter.api.Test;

import com.jdc.mkt.handler.Handler;

public class BHandlerTest {
	Handler handle = new Handler();
	
	//@Test
	void testName() {	
		handle.useName();
	}
	
	@Test
	void testAge() {
		handle.useAge();
	}
	
	//@Test
	void testRecursive() {
		handle.recursive();
	}
	
	
}

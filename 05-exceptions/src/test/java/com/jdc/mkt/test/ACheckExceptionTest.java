package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.jdc.mkt.check.CheckExceptionData;

public class ACheckExceptionTest {

	CheckExceptionData data = new CheckExceptionData();
	
	@Test
	void fileTest() {
		String res = data.createFile("");
		assertEquals(res, "exit");
		
		String res1 = data.createFile("D:/data/");
		assertEquals(res1, "IOException");
		
	}
}

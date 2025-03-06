package com.jdc.mkt.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class AListDataTest extends JunitConfig{
	
	@Test
	void useMethodInListTest() {
		List<String> list = data.useList("L");
		assertTrue(list.contains("Andrew"));
		assertFalse(list.containsAll(List.of("Andrew","James")));
		list.add("James");
		assertEquals(list.size(), 6);
		list.remove("James");
		assertFalse(list.contains("James"));
	}
	
	@Disabled
	@ParameterizedTest
	@CsvSource({"0,Andrew","3,Henery"})
	void selectListTest(int index,String res) {
		List<String> list = data.useList("L");
		assertEquals(res, list.get(index));
	}
	
	@Disabled
	@ParameterizedTest
	@ValueSource(strings = {"a","L"})
	void showListElementTest(String str) {	
		for(String s:data.useList(str.toUpperCase())) {
			System.out.println("Element : "+s);
		}
		System.out.println();
	}
}

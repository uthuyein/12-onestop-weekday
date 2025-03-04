package com.jdc.mkt.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetDataTest {

	static CollectionData data;
	static TreeData tree;
	
	@BeforeAll
	static void init() {
		data = new CollectionData();
		tree = new TreeData();
	}
	
	@Test
	void treeSetTest() {
		TreeSet<Person> set = tree.useTreeset();
		for(Person p :set) {
			System.out.println(p.name()+"\t"+p.age());
		}
	}
	
	@ParameterizedTest
	@CsvSource({"0,Andrew","3,Henery"})
	void selectListTest(int index,String res) {
		
	}
	
	@Disabled
	@ParameterizedTest
	@ValueSource(strings = {"h","L","t"})
	void useListTest(String str) {
		System.out.println("Use Set Type : "+str);
		for(String s:data.useSet(str.toUpperCase())) {
			System.out.println("Element : "+s);
		}
		System.out.println();
	}
}

package com.jdc.mkt.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class BSetDataTest extends JunitConfig{

	static TreeData tree = new TreeData();;
		
	@ParameterizedTest
	@CsvSource({"Andrew,Andrew","James ,not match name"})
	void useMethodInSetTest(String name,String res) {
		Set<String> set = data.useSet("H");
		
		String str = set.contains(name)? name :"not match name";
		assertEquals(str, res);
			
	}
	
	@Test
	@Disabled
	void treeSetTest() {
		TreeSet<Person> set = tree.useTreeset();
		for(Person p :set) {
			System.out.println(p.name()+"\t"+p.age());
		}
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

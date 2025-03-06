package com.jdc.mkt.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class EMapDataTest extends JunitConfig{

	private Map<Integer, String> map ;
	
	@Test
	@Order(4)
	void useTreeMapWithPersonData() {
		Map<Person, String> persons = new TreeMap<Person, String>();
		
		persons.put(new Person("c",22,new Human("tt",1)), "Celia");
		persons.put(new Person("a",12,new Human("ss",1)), "Andrew");
		persons.put(new Person("b",30,new Human("aa",2)), "Boby");
		persons.put(new Person("g",11,new Human("bb",3)), "Grok");
		
		for(Entry<Person, String> e : persons.entrySet()) {
			System.out.println("Key :"+e.getKey()+"\tValue :"+e.getValue());
		}
	}
	
	@Test
	@Order(3)
	void userTreeMapTest() {
		map = data.useMap("tree");
		addData();
		showData(map);
	}
	
	@Test
	@Order(2)
	void useLinkHashMapTest() {
		map = data.useMap("link");
		addData();
		String name = map.getOrDefault(3, "Elon musk");
		System.out.println(name);
		
		assertEquals("Oliver", map.remove(3));
		
		map.replace(4, "Elon musk");
		
		assertEquals("Elon musk", map.get(4));
	}
	
	@Test
	@Order(1)
	void useHashMapTest() {
		map = data.useMap("hash");
		addData();
		showData(map);	
	}
	
	private void showData(Map<Integer, String> map) {
		for(Entry<Integer,String> e: map.entrySet()) {
			System.out.println(e.getKey()+"\t"+e.getValue());			
		}
	}
	
	private void addData() {
		map.put(3, "John");
		map.put(5, "William");
		map.put(1, "Jackson");
		map.put(3, "Oliver");
		map.put(2, "John");
		map.put(4, "Orgus");
		map.put(6, "Andrew");
	}
}

package com.jdc.mkt.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeData {

	private Person[] array = {
			new Person("Andrew",23),
			new Person("John",33),
			new Person("Alex",45),
			new Person("Phonix",33),
			new Person("Kelvin",22)};
	
	
	public TreeSet<Person> useTreeset(){
		TreeSet<Person> set = new TreeSet<Person>();
		set.addAll(Set.of(array));
		return set;
	} 
}

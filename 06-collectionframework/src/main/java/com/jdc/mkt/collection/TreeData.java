package com.jdc.mkt.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeData {

	private Person[] array = {
			new Person("Andrew",23,new Human("tt",1)),
			new Person("John",33,new Human("ee",2)),
			new Person("Alex",45,new Human("dd",5)),
			new Person("Phonix",33,new Human("ff",5)),
			new Person("Kelvin",22,new Human("gg",4))};
	
	
	public TreeSet<Person> useTreeset(){
		TreeSet<Person> set = new TreeSet<Person>();
		set.addAll(Set.of(array));
		return set;
	} 
}

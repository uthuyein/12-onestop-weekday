package com.jdc.mkt.collection;

public record Person(
		String name,
		int age) implements Comparable<Person>{

	@Override
	public int compareTo(Person p) {
		//return name.compareTo(p.name);
		return age > p.age ? 1 : -1 ;
	}
	
}

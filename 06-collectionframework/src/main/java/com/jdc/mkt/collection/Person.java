package com.jdc.mkt.collection;

public record Person(String name, int age, Human human) implements Comparable<Person> {

	@Override
	public int compareTo(Person p) {
		// return name.compareTo(p.name);
		return human.age() > p.human.age() ? 1 : -1;
	}

}

record Human(String name, int age) {
}

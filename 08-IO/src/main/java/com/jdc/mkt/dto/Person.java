package com.jdc.mkt.dto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	private String name;
	private transient int age;
	private Address address;
	
	public Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	// deep copy
	public Person(Person p) {
		this.name = p.name;
		this.age = p.age;
		this.address = new Address(p.address);
	}

	@Override
	// shallow copy
	public Person clone() throws CloneNotSupportedException {
		return (Person) super.clone();
	}

	public Person deepCopy() {
		File file = new File("Person.obj");
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
				ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {		
				out.writeObject(this);
				return (Person) in.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void show() {
		System.out.println("Name :" + name + "\tAge :" + age + "\tAddress :" + address.city);
	}

}

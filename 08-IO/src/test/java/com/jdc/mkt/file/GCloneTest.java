package com.jdc.mkt.file;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.dto.Address;
import com.jdc.mkt.dto.Person;

public class GCloneTest {
	
	Person p = new Person("Andrew", 20,new Address("Yangon"));
	
	@Test
	//@Disabled
	void deepCopyWithObjectOutputStreamTest() {
		Person pColne = p.deepCopy();
		p.show();
		pColne.show();
	}
	
	@Test
	@Disabled
	void deepCopyWithConstructorTest() {
		Person pClone = new Person(p);
		p.show();
		pClone.show();
	}

	@Test
	@Disabled
	void shallowCloneTest() throws CloneNotSupportedException {
		Person pClone = p.clone();	
		System.out.println(p);
		System.out.println(pClone);
		
		p.show();
		pClone.show();
	}
}

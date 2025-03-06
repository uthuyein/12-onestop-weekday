package com.jdc.mkt.collection;

import java.util.ArrayDeque;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class DDequeDataTest extends JunitConfig{

	private ArrayDeque<String> deque;
	
	@BeforeEach
	void addData() {
		 deque =  data.useDeque();
		 deque.addLast("James");
		 deque.addFirst("William");
		 deque.add("John");
		 deque.addFirst("Andrew");
		 deque.addLast("Mary");
		 deque.add("Kelvin");
		
	}
	
	@Test
	@Order(1)
	void showData() {
		for(String s:deque) {
			System.out.println(s);
		}
	}
}

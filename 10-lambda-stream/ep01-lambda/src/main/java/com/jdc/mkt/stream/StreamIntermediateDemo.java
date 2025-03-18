package com.jdc.mkt.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamIntermediateDemo {

	static List<String> list = new ArrayList<String>(List.of("3","6","1","4","2","1","8","8","7","9","5"));
	
	public static void main(String[] args) {
		//use();
		useTakeWhileVsDropWhile();
	}
	
	static void useTakeWhileVsDropWhile() {
		list.stream()
		.sorted()
		.distinct()
		.mapToInt(n -> Integer.parseInt(n))
		.takeWhile(n -> n < 5)
		.forEach(System.out::println);
		System.out.println();
		
		list.stream()
		.sorted()
		.distinct()
		.mapToInt(n -> Integer.parseInt(n))
		.dropWhile(n -> n < 5)
		.forEach(System.out::println);
	}
	
	static void use() {
		list.stream()
		.distinct() // collect one element when duplicate
		.mapToInt(n -> Integer.parseInt(n)) // stream covert to int
		.sorted() // ordering asc
		.skip(3) // skip 1,2,3
		.forEach(System.out::println);
	}
}

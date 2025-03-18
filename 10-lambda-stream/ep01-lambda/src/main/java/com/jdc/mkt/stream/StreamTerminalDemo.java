package com.jdc.mkt.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTerminalDemo {

	static List<String> list = new ArrayList<String>(List.of("3","6","1","4","2","1","8","8","7","9","5"));
	
	public static void main(String[] args) {
		//useForEachOrdered();
		//useChecking();
		singleResult();
	}
	
	static void collector() {
//		list.stream()
//		.mapToInt(i -> Integer.parseInt(i))
//		.filter(a -> (a%2) == 0)
		
	}
	
	static void singleResult() {
		 list.stream()
		 .sorted()
				.findFirst()
				.ifPresentOrElse(
						a -> System.out.println(a), 
						() -> System.out.println("no value"));;
	}
	
	static void useChecking() {
		var res = list.stream()
		.mapToInt(n -> Integer.parseInt(n))
		.filter(a -> (a%2) != 0)
		.noneMatch(a -> (a % 2 )== 0 );
		System.out.println(res);
		
	}
	
	static void useForEachOrdered() {
		list.parallelStream()
		.sorted()
		.forEachOrdered(System.out::println);
	}
}

package com.jdc.mkt.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(List.of("2","3","4"));
		int before = sumWithoutStream(list);
		System.out.println(before);
		
		int after = sumWithStream(list);
		System.out.println(after);
	}
	
	//declarative style
	static int sumWithStream(List<String> list) {
		return list.stream().mapToInt(s -> Integer.parseInt(s)).sum();
	}
	
	//imperative style
	static int sumWithoutStream(List<String> list) {
		int sum = 0 ;
		for(String s : list) {
			sum += Integer.parseInt(s);
		}
		return sum;
		
	}
}

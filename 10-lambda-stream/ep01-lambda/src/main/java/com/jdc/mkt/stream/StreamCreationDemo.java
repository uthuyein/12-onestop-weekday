package com.jdc.mkt.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationDemo {

	public static void main(String[] args) {
		//useCollectionVsArrays();
		//useGenerateVsIterate();
		//useRangeVsRangeClosed();
		useFactoryMethod();
	}
	
	static void useFactoryMethod() {
		Stream.of("hh","mm","bb")
		.map(e -> String.valueOf(e))
		.sorted()
		.forEach(System.out::print);
	}
	
	static void useRangeVsRangeClosed() {
		IntStream.range(1, 10).forEach(System.out::println);
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
	}
	
	static void useGenerateVsIterate() {
		IntStream.iterate(1, a -> ++a )
		.limit(5)
		.forEach(e -> System.out.println(e));
		
		DoubleStream
		.generate(Math::random)
		.limit(5)
		.forEach(System.out::println);;
	}

	static void useCollectionVsArrays() {
		String[] array = { "Zebra", "Lion", "Bird", "Owl", "Lion" };

		Arrays.stream(array).distinct().sorted().forEach(e -> System.out.println(e));

		List<String> list = new ArrayList<String>(List.of(array));
		list.stream().distinct().sorted().forEach(e -> System.out.println(e));

	}
}

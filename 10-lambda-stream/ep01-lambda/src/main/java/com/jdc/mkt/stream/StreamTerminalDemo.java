package com.jdc.mkt.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminalDemo {

	static List<String> list = new ArrayList<String>(List.of("3", "6", "1", "4", "2", "1", "8", "8", "7", "9", "5"));

	public static void main(String[] args) {
		// useForEachOrdered();
		// useChecking();
		// singleResult();
		// countVsSumAndOther();
		// reduce();
		collect();
	}

	static void collect() {
		var li = Stream.of(list, List.of("A", "B"))
				.flatMap(e -> e.stream()).collect(Collectors.toList());
		System.out.println(li);
	}

	static void reduce() {
		var res = list.stream().distinct().reduce((a, b) -> a + "," + b).orElse("no vaule");
		System.out.println(res);
	}

	static void countVsSumAndOther() {
		var res = list.stream().mapToInt(e -> Integer.parseInt(e)).sorted().distinct()
				// .count();
				// .sum();
				// .min().getAsInt();
				.max().getAsInt();
		System.out.println(res);

	}

	static void singleResult() {
		list.stream().sorted().findFirst().ifPresentOrElse(a -> System.out.println(a),
				() -> System.out.println("no value"));
		;
	}

	static void useChecking() {
		var res = list.stream().mapToInt(n -> Integer.parseInt(n)).filter(a -> (a % 2) != 0)
				.allMatch(a -> (a % 2) == 0);
		System.out.println(res);

	}

	static void useForEachOrdered() {
		list.parallelStream().sorted().forEachOrdered(System.out::println);
	}
}

package com.jdc.mkt;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DefultFunctionalInterfaceDemo {

	public static void main(String[] args) {
		usePredicate("Hello","H","o");
	}

	static void usePredicate(String message,String prefix,String suffix) {
		
		Predicate<String> p1 = str -> str.endsWith(suffix);
		Predicate<String> p2 = str -> str.startsWith(prefix);
		
		Predicate<String> p3 = str -> p1.and(p2).test(str);
		
		System.out.println(p3.test(message));
	}

	static void useFunction() {

		Function<Integer, Integer> f1 = a -> a * 2;
		Function<Integer, Integer> f2 = a -> a - 2;

		// use f1 first and then f2
		Function<Integer, Integer> fAndThen = f1.andThen(f2);
		int res1 = fAndThen.apply(3);
		System.out.println("Result for function andThen :" + res1);

		// use f2 first and then f1
		Function<Integer, Integer> fCompose = f1.compose(f2);
		int res2 = fCompose.apply(3);
		System.out.println("Result for function composing :" + res2);
	}

	static void useConsumer() {
		Consumer<String> first = message -> System.out.println(message);
		Consumer<String> second = message -> System.out.println(message.toUpperCase());
		;

		Consumer<String> compose = first.andThen(second);
		compose.accept("hello");
	}
}

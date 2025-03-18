package com.jdc.mkt.stream;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) {
		System.out.println(getValue("Hello").orElse("no value"));
		System.out.println(getValue(null).get());
		System.out.println(getValue(null).orElseThrow(() -> new NoSuchElementException()));
	}

	static Optional<String> getValue(String value) {
		return Optional.ofNullable(value);
	}
}

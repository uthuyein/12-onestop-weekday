package com.jdc.mkt;

public class Data<T> {

	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	//generic type V in method
	static <V> void doSomething(V v) {
		System.out.println(v);
	}
	
}

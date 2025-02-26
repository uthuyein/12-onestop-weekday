package com.jdc.mkt.bounded;

import com.jdc.mkt.utils.A;
import com.jdc.mkt.utils.B;

public class BoundedDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Data<A> a = new Data<>(new A());
		Data<B> s = new Data<>(new B());
	}
}

class Data<T extends A>{
	private T data;

	public Data(T data) {
		this.data = data;
	}
	public T getData() {
		return data;
	}
	
}

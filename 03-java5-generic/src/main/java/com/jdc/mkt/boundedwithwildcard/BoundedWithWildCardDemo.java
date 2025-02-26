package com.jdc.mkt.boundedwithwildcard;

import com.jdc.mkt.utils.A;
import com.jdc.mkt.utils.B;
import com.jdc.mkt.utils.C;

public class BoundedWithWildCardDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Data<A> a =  new Data<>();
		Data<B> b =  new Data<>();
		Data<C> c =  new Data<>();
		Data<Object> o = new Data<>();
		
		upper(b);
		upper(c);
		
		lower(b);
		lower(a);
		lower(o);
		
		b.setData(new B());
		
		Data<? super B> b1 = new Data<>();
		b.setData(new B());
		
		Data<? extends B> b2 = new Data<>();		
		//can't use setter because 
		//it can be used for parent type(eg.object)
		//b2.setData(new A());
	}
	
	static void upper(Data<? extends B> data) {
		//data.setData(new B());
		System.out.println("From Upper :"+data.getData());
	}
	
	static void lower(Data<? super B> data) {
		//data.setData(new B());
		System.out.println("From Lower :"+data.getData());
	}
}

class Data<T>{
	private T data;

	public void setData(T data) {
		this.data = data;
	}
	public T getData() {
		return data;
	}
	
}

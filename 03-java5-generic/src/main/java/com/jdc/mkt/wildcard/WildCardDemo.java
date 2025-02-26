package com.jdc.mkt.wildcard;

public class WildCardDemo {

	static Data<?> data;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Data<String> d1 = new Data<>();
		d1.setData("Hello");
		
		useData(d1);
		
		useData(new Data<String>());
		
		Data<?> d2 = new Data<Integer>();
		//d2.setData(10);
			
	}
	
	
	static void useData(Data<?> data) {
		//data.setData(10);
		System.out.println(data.getData());
	}
}

class Data<T>{
	private T data;
	public Data() {}
	public Data(T data) {
		this.data = data;
	}
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
}

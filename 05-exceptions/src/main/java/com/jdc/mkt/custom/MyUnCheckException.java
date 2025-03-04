package com.jdc.mkt.custom;

@SuppressWarnings("serial")
public class MyUnCheckException extends RuntimeException{
	
	public MyUnCheckException() {
		super();
	}
	
	public MyUnCheckException(String message) {
		super(message);
	}
}

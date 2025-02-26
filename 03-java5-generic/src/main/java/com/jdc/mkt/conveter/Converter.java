package com.jdc.mkt.conveter;

public interface Converter<T,R> {
	public R convert(T t);
	
}

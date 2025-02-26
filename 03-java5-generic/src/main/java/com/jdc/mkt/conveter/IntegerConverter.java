package com.jdc.mkt.conveter;

public class IntegerConverter implements Converter<String, Integer>{

	@Override
	public Integer convert(String s) {
		return Integer.valueOf(s);
	}

}

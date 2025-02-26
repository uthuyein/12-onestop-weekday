package com.jdc.mkt.conveter;

public class StringConverter implements Converter<Integer, String>{

	@Override
	public String convert(Integer i) {
		return String.valueOf(i);
	}

}

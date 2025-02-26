package com.jdc.mkt;

import com.jdc.mkt.conveter.Converter;
import com.jdc.mkt.conveter.IntegerConverter;
import com.jdc.mkt.conveter.StringConverter;

public class Main {

	public static void main(String[] args) {
		Data<String> d = new Data<>();
		d.setValue("30");
		String str = d.getValue();		
		System.out.println(str);
		
		//use generic method
		Data.doSomething("Hello");
		
		Converter<String, Integer> cInt = new IntegerConverter();
		int a =  cInt.convert("50");
		System.out.println(a);
		
		Converter<Integer, String> cString = new StringConverter();
		String s = cString.convert(50);
		System.out.println(s);
		
	}
	
	
}

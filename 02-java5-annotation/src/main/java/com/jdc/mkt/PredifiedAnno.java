package com.jdc.mkt;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class PredifiedAnno implements Serializable{
	
	private int count;
	
	@Deprecated
	int counter() {
		return count ++ ;
	}
	
	@SafeVarargs
	static void add(List<String>...strs) {
		for(List<String> s :strs) {
			System.out.println(s);
		}
	}
	
}

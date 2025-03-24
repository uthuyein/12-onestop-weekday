package com.jdc.mkt.dto;

import lombok.Getter;

@Getter
public class Counter {
	
	private  int counter;
	
	public void countUp() {
		 ++ counter;
	}
	
	
}

package com.jdc.mkt.dto;

public enum Planet {
	Sunday(1,6),Monday(2,15),Tuesday(3,8),Wednesday(4,17),Saturday(7,10),Thursday(5,19),Yahu(8,12),Friday(6,21);
	
	private int pNumber;
	private int pAge;
	
	 Planet(int pNumber,int pAge) {
		this.pNumber = pNumber;
		this.pAge = pAge;
	}
	 
	public int getPNumber() {
		return pNumber;
	}
	
	public int getPAge() {
		return pAge;
	}
	
}

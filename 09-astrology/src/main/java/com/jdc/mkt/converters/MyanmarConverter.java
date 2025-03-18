package com.jdc.mkt.converters;

public class MyanmarConverter{

	public static int convert(int year,int month,int day){
		
		if(month >= 1 && month < 4){		
				return year - 639 ;			
		}

		if(month == 4){
			if(day >=1 && day <= 16){
				return year - 639 ;
			}
		}
		return year - 638 ;
	}
}
package com.jdc.mkt.trycatch;

public class TryCatchData {
	
	public int useUncheckedWithTryMultiCatch(int[]array, String index) {
		try {
			int i = Integer.parseInt(index);
			return array[i];
			
		}catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			return -1;
		}		
		
	}

	public String useUncheckedWithTryCatch(Integer num) {
		try {
			int i = num / 0 ;
			
			Object b = num;
			return (String)b;
			
		}catch (ClassCastException e) {
			return "ClassCastException";
		
		}catch(ArithmeticException e) {
			return "ArithmeticException";
		
		}catch(RuntimeException e) {
			return "RuntimeException";
		}
	}
}

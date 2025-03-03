package com.jdc.mkt.trycatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchData {
	
	public String useCheckedWitchTryFinallyAndResource() {
		String str = null;
		int res = 0 ;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){		
			System.out.println("Type Number !!!!!");
			str = br.readLine();
			res = Integer.parseInt(str);
			//br.close();
			
		}catch (IOException  | NumberFormatException e) {	
			str = "Exception";
			
		}finally {
			str = str +" with change the number of :"+res;
		}
		
		return str;
	}
	
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

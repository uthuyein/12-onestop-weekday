package com.jdc.mkt.controller;

public class MaharboteController{

	public String getSign(int myanmarYear, int dayName){

		String[]signArray = {"Binga","Mayana","Ahtun","Thike","Yaza","Puti","Adipiti"};

		int[] maharboteArray = getMaharBote(myanmarYear);
		int index = getIndex(dayName,maharboteArray);
	
		return signArray[index];
	}

	public int[] getMaharBote(int myanmarYear){

		int []formulaArray = {1,4,0,3,6,2,5};
		int remainder = myanmarYear % 7 ;

		int index = getIndex(remainder,formulaArray);
		
		int [] maharboteArray = new int[formulaArray.length];

		for(int j = 0 ; j < maharboteArray.length ; j ++){

			maharboteArray[j] = formulaArray[index];
			
			if(index < formulaArray.length ){
				index ++ ;
			}
			if(index == 7){
				index = 0 ;
			}
			
		}
		return maharboteArray ;
	}
	private int getIndex(int remainder,int[] array){
		int index = 0 ;
		for(int i = 0 ; i < array.length ; i++){
			if(array[i] == remainder){
				index = i ;
			}
		}
		return index;
	}
}
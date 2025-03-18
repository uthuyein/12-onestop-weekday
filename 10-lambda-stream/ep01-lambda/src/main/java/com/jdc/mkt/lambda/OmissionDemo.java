package com.jdc.mkt.lambda;

public class OmissionDemo {

	void show() {
		int a = 50 ;
		WithoutArgInter i1 = () ->  a ;	
		System.out.println(i1.getValue());
		
		
		ReturnInter i3 = (x, y) -> "Result :"+(x + y) ;	
		System.out.println(i3.getMessage(3, 2));
		
		
		VoidInter i2 =  message -> System.out.println(message);	
		i2.showMessage("Hello ");
		
		
	}
}

@FunctionalInterface
interface ReturnInter{
	String getMessage(int a, int b);
}

@FunctionalInterface
interface VoidInter{
	void showMessage(String message);
}

@FunctionalInterface
interface WithoutArgInter{
	int getValue();
}

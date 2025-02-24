package com.jdc.mkt;

public class OCPrinciple {

	public static void main(String[] args) {
		Computer com = new Computer();
		com.useStandardKeyboard();
		Laptop lap = new Laptop();
		
		lap.useStandardKeyboard();
		lap.useWirelessKeyboard();
	}
}

class Computer{
	
	void useStandardKeyboard() {
		System.out.println("Standard keyboard");
	}
	
	//after finishing the project, the client asked to use a new keyboard
	//break ocp
//	void useWirelessKeyboard() {
//		System.out.println("Wireless keyboard");
//	}
}

class Laptop extends Computer {

	// after finishing the project, the client asked to use a new keyboard
	// break ocp
	void useWirelessKeyboard() {
		System.out.println("Wireless keyboard");
	}
}



package com.jdc.mkt;

public class DIPrinciple {

	public static void main(String[] args) {
		// high-level module
		Keyboard standardKeyboard = new WirelessKeyboard();
		standardKeyboard.type();
		//standardKeyboard.specialKey();
	}
}

class WirelessKeyboard implements Keyboard {
	// low-level module
	public void type() {
		System.out.println("Using Wireless keyboard for typing");
	}

	
	public void specialKey() {
		// TODO Auto-generated method stub
		
	}
}

class StandardKeyboard implements Keyboard {
	// low-level module
	public void type() {
		System.out.println("Using Standard keyboard for typing");
	}

	
	public void specialKey() {
		// TODO Auto-generated method stub
		
	}
}

// Dependency Inversion Principle
interface Keyboard {
	void type();
	//void specialKey();
}

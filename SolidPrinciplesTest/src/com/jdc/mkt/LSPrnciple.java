package com.jdc.mkt;

public class LSPrnciple {

	public static void main(String[] args) {
		Flyable bird = new Bird();
		bird.fly();
		
		//boomb crash
		Flyable penguin = new Penguin();
		penguin.fly();
		
	}
}

interface Flyable {
	void fly();
}

class Bird implements Flyable {
	public void fly() {
		System.out.println("Bird is flying");
	}
}

// Penguin is a bird but it cannot fly
//break Liskov Substitution Principle
class Penguin implements Flyable{
	public void fly() {
		System.out.println("Penguin is flying");
	}
}

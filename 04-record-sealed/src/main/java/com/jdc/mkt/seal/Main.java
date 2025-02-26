package com.jdc.mkt.seal;

public class Main {
	public static void main(String[] args) {
		
	}
}

final class Student extends School{}
non-sealed class Teacher extends School{}

record Staff(int id,String name) implements Cashier {}
final class  Employee implements Cashier{}

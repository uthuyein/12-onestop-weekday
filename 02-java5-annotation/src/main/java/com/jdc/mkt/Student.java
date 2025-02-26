package com.jdc.mkt;

public class Student extends StudentAnno{
	
	public Student(	String name, int age) throws NoSuchFieldException, SecurityException, NoSuchMethodException {
		super(name,age);	
	}
		
	public Grade[] getGrade() throws NoSuchMethodException, SecurityException {	
		return grades;
	}

	public String getName() throws NoSuchFieldException{	
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
}






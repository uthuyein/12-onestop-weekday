package com.jdc.mkt;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Student {

	@NameChecker("William")
	private String name;	
	private int age;
	
	private Grade[] grades;
	
	public Student(	String name,@AgeChecker int age) throws NoSuchFieldException, SecurityException {
		this.name = name;
		this.age = checkAge(age);
	}
	
	private int checkAge(int age) throws NoSuchFieldException, SecurityException {
		Field f = Student.class.getDeclaredField("age");
		AgeChecker checker = f.getDeclaredAnnotation(AgeChecker.class);
		
		if(null != checker) {
			return checker.age();
		}
		return age;
	}
	
	public Grade[] getGrade() throws NoSuchMethodException, SecurityException {
		addGrade();
		return grades;
	}

	@GradeAdder({Grade.GradeA,Grade.GradeB})
	public void addGrade() throws NoSuchMethodException, SecurityException {
		Method m = Student.class.getDeclaredMethod("addGrade");
		GradeAdder adder = m.getAnnotation(GradeAdder.class);
		
		if(null != adder) {
			this.grades = adder.value();
		}else {
			this.grades = new Grade[0];
		}
	}

	public String getName() throws NoSuchFieldException{
		Field f = Student.class.getDeclaredField("name");
		NameChecker checker = f.getAnnotation(NameChecker.class);
		
		if(null != checker) {
			return checker.value();
		}
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
}






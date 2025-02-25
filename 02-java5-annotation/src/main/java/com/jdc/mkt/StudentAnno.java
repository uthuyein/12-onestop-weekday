package com.jdc.mkt;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import com.jdc.mkt.anno.AgeChecker;
import com.jdc.mkt.anno.GradeAdder;
import com.jdc.mkt.anno.NameChecker;

public class StudentAnno {
	
	@NameChecker("William")
	 String name;	
	 int age;	
	 Grade[] grades;
	 	
	public StudentAnno(String name,@AgeChecker(age = 5) int age) throws NoSuchFieldException, SecurityException, NoSuchMethodException {
		this.name = checkName(name);
		this.age = checkAge(age);
		this.grades = addGrade();
	}

	private String checkName(String name) throws NoSuchFieldException, SecurityException {
		Field f = StudentAnno.class.getDeclaredField("name");
		NameChecker checker = f.getDeclaredAnnotation(NameChecker.class);
		
		if(null != checker) {
			return checker.value();
		}
		return name;
	}

	 private int checkAge(int age) throws NoSuchFieldException, SecurityException, NoSuchMethodException {	 
		Constructor[]cons = StudentAnno.class.getConstructors();
		
		for(Constructor con : cons) {
			Parameter[] params = con.getParameters();
			for(Parameter p :params) {
				
				if(p.isAnnotationPresent(AgeChecker.class)) {
					AgeChecker checker =  p.getAnnotation(AgeChecker.class);
					return checker.age();
				}
			}
		}
	
		 return age;
	}
	

	@GradeAdder({Grade.GradeA,Grade.GradeB})
	private Grade[] addGrade() throws NoSuchMethodException, SecurityException {
		Method m = StudentAnno.class.getDeclaredMethod("addGrade");
		GradeAdder adder = m.getAnnotation(GradeAdder.class);
		
		if(null != adder) {
			return adder.value();
		}
			return new Grade[0];
	}
	
}

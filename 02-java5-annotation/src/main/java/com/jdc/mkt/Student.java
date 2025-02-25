package com.jdc.mkt;

import com.jdc.mkt.anno.ParentAnno;

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
	
	public String getClassName() {
		ParentAnno anno =  Student.class.getAnnotation(ParentAnno.class);
		if(null != anno) {
			return anno.value();
		}
		return "No class found";
	}
		
}






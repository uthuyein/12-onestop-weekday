package student_reg.dto;

public class Student{

	private String name;
	private int age;
	private int roll;

	public Student(String name,int age,int roll){
		this.name = name ;
		this.age = checkAge(age) ;
		this.roll = roll ;
	}
	private int checkAge(int age){
		if(age > 0){
			return age ;
		}
		return 0 ;
	}
	
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public int getRoll(){
		return roll;
	}
}

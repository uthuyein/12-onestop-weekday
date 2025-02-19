package student_reg.services;

import java.util.Arrays;
import student_reg.dto.Student;

public class StudentService{

	private static Student[]students = new Student[0];

	public static void addStudent(Student student){
		students = Arrays.copyOf(students,students.length+1);
		students[students.length-1] = student;
	}

	public static Student[] getStudents(){
		return students;
	}
}

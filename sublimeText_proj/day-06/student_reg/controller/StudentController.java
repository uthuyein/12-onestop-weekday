package student_reg.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import student_reg.dto.Student;
import static student_reg.services.StudentService.*;

public class StudentController{

	private BufferedReader br ;

	public StudentController(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public void showStudent(){
		for(Student stu : getStudents()){
			System.out.println(stu.getName());
		}
	}

	public void createStudent() throws  b{
		String yes = "";
		do{
			System.out.println("Student Name ?");
			String name = br.readLine();
			System.out.println("Student age ?");
			int age = Integer.parseInt(br.readLine());
			System.out.println("Student roll number ?");
			int roll = Integer.parseInt(br.readLine());;

			Student stu = new Student(name,age,roll);
			addStudent(stu);

			System.out.println("Do you want to add again ?/y");
			yes = br.readLine();

		}while("y".equals(yes));
	}
}

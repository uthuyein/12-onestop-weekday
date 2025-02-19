package student_reg;

import java.io.IOException;
import student_reg.controller.StudentController;

public class Main{
	public static void main(String[] args) throws IOException{
		StudentController con = new StudentController();
		con.createStudent();
		con.showStudent();
	}
}
`
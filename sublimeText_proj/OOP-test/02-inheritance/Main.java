class Main{
	public static void main(String[] args) {
		Student student = new Student();
		//from student
		student.study();
		
		//from Human
		student.eat();
		student.sleep();

		//from PartTimeWorker
		student.partTimeWork();
	}
}
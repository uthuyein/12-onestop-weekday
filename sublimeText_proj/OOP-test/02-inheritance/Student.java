
//Human also called super or parent
//Student also called sub or child
class Student extends PartTimeWorker{

	Student(){
		super();
	}
	Student(String name){
		//super();
		this();

	}

	void study(){
		System.out.println("studying something !");
	}
}
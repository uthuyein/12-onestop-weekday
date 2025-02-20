public class Main{
	public static void main(String[] args) {
		
		Student stu = new Student("Andrew",-1);
		
		System.out.println("Old Name :"+stu.getName());
		System.out.println(stu.getAge());

		stu.changeNickName("ko Paht tee");
		System.out.println("New Name :"+stu.getName());

		doSomething();
		
		// Student.Checker checker = stu.new Checker();
		// int age =  checker.checkAge();
		// System.out.println(age);

		// Student.Nick nick = new Student.Nick();
		// nick.addNickName("Ko wa toke");
		// System.out.println("New Name :"+stu.getName());
	}

	static void doSomething(){
		//local class
		class Work{
			void doWork(){
				System.out.println("Do Work !");
			}
		}
		Work w = new Work();
		w.doWork();
	}
}

class Student{
	private static String name ;
	private int age ;

	Student(String name, int age){
		this.name = name ;
		this.age = age;
	}

	void changeNickName(String nick){
		Nick n = new Nick();
		n.addNickName(nick);
	}

	String  getName(){
		return name ;
	}

	int getAge(){
		Checker inner = new Checker();
		return inner.checkAge();
	}

	//static nested classs
	//name(from student) must be static 
	private static class Nick{
		void addNickName(String nickName){
			name = nickName ;
		}
	}

	// Inner class
	// it is only used for student
	private class Checker{
		int checkAge(){
			return age < 0 ? 1 : age ;
		}
	}
}



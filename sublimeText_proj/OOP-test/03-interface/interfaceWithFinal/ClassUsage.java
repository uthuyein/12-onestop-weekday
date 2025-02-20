public class ClassUsage{
	public static void main(String[] args) {
		//TestClass test = new TestClass();
		TestClass.show();
	}
}
class TestClass{
	static{
		System.out.println("Static Block !");
	}
	{
		System.out.println("Instance Block !");
	}
	TestClass(){
		System.out.println("Constructor !");
	}

	static void show(){
		System.out.println("Show static ");
	}
	void useLocal(){
		class LocalInnerClass{
			void doSomething(){
				System.out.println("Do something from local inner class");
			}
		}
	}
	class InnerClass{
		void doSomething(){
			System.out.println("Do something from inner class !");
		}
	}

	
}
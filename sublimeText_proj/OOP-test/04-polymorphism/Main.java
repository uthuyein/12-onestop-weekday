public  class Main{
	public static void main(String[] args) {
		//Many Behavior
		A a = new A();
		a.doSomething();

		A aa = new B(); // implicit
		aa.doSomething();
		//aa.show();
		B bb = (B)new A(); //explicit

		A aaa = new C();
		aaa.doSomething();
		
		//Many Shape
		A s1 = new C();
		s1.doSomething();

		B s2 = new C();
		s2.doSomething();
		s2.show();

		C s3 = new C();
		s3.doSomething();
		s3.show();

		Object s4 = new C();

	}
}

class A{
	void doSomething(){
		System.out.println("Do something from A");
	}
}
class B extends A{
	void doSomething(){
		System.out.println("Do something from B");
	}
	void show(){
		System.out.println("Show something from B !");
	}
}
class C extends B{}





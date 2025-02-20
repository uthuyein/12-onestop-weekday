class DiamondProblem{
	public static void main(String[] args) {
		A d = new D();
		d.doSomething();
	}
}

class D implements B,C{

	@Override
	public void doSomething(){
		B.super.doSomething();
	}
}

interface C extends A{

	@Override
	default void doSomething(){
		System.out.println("From C");
	}
}
interface B extends A{
	@Override
	default void doSomething(){
		System.out.println("From B");
	}
}

interface A{
	default void doSomething(){
		System.out.println("From A");
	}
}
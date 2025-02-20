class Main{
	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.sleep();
		lion.live(10);

		int a = 10 ;
		byte b = 20 ;
		a = b; //(implicit)
		b = (byte)a ; // (explicit)

		Parent p = new Child();//(implicit)
		
	}
}
class Parent{}
class Child extends Parent{}

class Animal{
	void sleep(){
		System.out.println("Sleep on ground !");
	}

	void live(Integer a){
		System.out.println("Lived in forest !");
	}

	 Parent getParent(){
		return new Parent();
	}
}

//1.must be same identifier
//2.must be same arg list and their type
//3.must be same return type or their sub type
//4.must be same access modifier or their parent
class Lion extends Animal{

	@Override
	public Child getParent(){
		return new Child();
	}

	@Override
	void live(Integer s){
		System.out.println("Lived in cage !");
		
	}
}
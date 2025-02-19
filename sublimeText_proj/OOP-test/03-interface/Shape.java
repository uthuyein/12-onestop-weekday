
// can't create instance method
interface Shape{

	  //default static final	
	  String name = "something";

	  //default public in abstract method
	  void draw();

	  //after java 8
	  static void show(){
	  	System.out.println("Use static");
	  }

	  default void check(){
		System.out.println("Use default");
	  }
}
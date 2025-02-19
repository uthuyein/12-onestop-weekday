class ThisDemo{
	String name ;

	//Using this() must be the first statement in constructor
	//this() is used for current object's constructor.
	ThisDemo(String name ,int age){
		this(name);
		System.out.println("Using with double args Constructor :"+name);
	}
	ThisDemo(String name){
		this();
		System.out.println("Using with single arg constructor :"+name);
	}
	ThisDemo(){
		System.out.println("Using without arg Constructor !");
	}
	public static void main(String[] args) {
		ThisDemo demo = new ThisDemo("Hello",3);
		this.name = "Hello";
	}
}
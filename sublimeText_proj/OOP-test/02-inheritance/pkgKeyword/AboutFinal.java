package pkgKeyword;

//AboutFinal can't extends from other class
public final class AboutFinal{

	//must be initialized with using constructor 
	//or directly assign value
	final String name ;

	public AboutFinal(String name){
		this.name = name ;
	}

	final void show(){
		System.out.println("Use final");
	}
}
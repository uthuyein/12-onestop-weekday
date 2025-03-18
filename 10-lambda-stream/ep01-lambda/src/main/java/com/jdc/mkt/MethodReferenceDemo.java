package com.jdc.mkt;

public class MethodReferenceDemo {
	
	public static void main(String[] args) {
		showMessage();
	}

	static void showMessage() {
		UseInter i1 = m -> System.out.println(m);
		i1.use("Hello Lambda");
		
		ReferenceData data = new ReferenceData();
		String message = "Hello Method Reference";
		
		UseInter i2 = data :: showInstanceMessage;
		i2.use(message);
		
		UseInter i3 = ReferenceData :: showStaticMessage;
		i3.use(message);
		
		UseInter i4 = ReferenceData :: new;
		i4.use(message);
	}
}

@FunctionalInterface
interface UseInter{
	void use(String message);
}
class ReferenceData {
	
	public ReferenceData() {}
	
	public ReferenceData(String message) {
		System.out.println("Use Constructor :: "+message);
	}
	
	static void showStaticMessage(String message) {
		System.out.println("Use static :: "+message);
	}

	void showInstanceMessage(String message) {
		System.out.println("Use Instance :: "+message);
	}
}

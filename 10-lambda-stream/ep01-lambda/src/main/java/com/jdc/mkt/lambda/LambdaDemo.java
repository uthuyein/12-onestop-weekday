package com.jdc.mkt.lambda;

public class LambdaDemo {

	public void beforeLambda(String message) {
		Messenger mess = new Messenger() {
			
			@Override
			public void showMessage(String message) {
				System.out.println(message);
			}
		};
		mess.showMessage(message);
	}
	
	public void afterLambda(String message) {
		Messenger mess = str -> System.out.println(str);
		mess.showMessage(message);
	}
}

@FunctionalInterface
interface Messenger{
	
	void showMessage(String message);
	static void hide() {};
}







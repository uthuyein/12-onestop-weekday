package com.jdc.mkt;

public class SRPrinciple {
	public static void main(String[] args) {
		User user = new User();
		user.setName("John");
		user.saveToDb();
		System.out.println(user.getName());
	}					
}

class User {

	private String name;
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	//should not hv in User 
	//break SRP 
	void saveToDb() {
		System.out.println("Save to to db !");
	}
	
}

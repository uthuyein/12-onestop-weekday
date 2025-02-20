class Main{
	public static void main(String[] args) {
		Factory factory = new Factory(new Employee);
		factory.setPosition("Manager");
		factory.showPosition();
	}
}
class Rectangle extends Calculate implements Shape,Color{
	
	//from Calculate class
	@Override
	public void showArea(){
		System.out.println("Show area from reactangle ");
	}

	//from Color class
	@Override
	public void print(){
		System.out.println("Red Color");
	}

	//from Shape class
	@Override
	public void draw(){
		System.out.println("Drawing reactangle !");
	}
}
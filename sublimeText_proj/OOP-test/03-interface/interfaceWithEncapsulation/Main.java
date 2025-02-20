class Main{
	public static void main(String[] args) {
		UserInterface inter = new UserImpl();
		//inter.name = " Aung Aung ";
		inter.setName("Aung Aung");
		System.out.println(inter.getName());
	}
}

class UserImpl implements UserInterface{
	public String name ;

	@Override
	public void setName(String name){
		this.name = name;
	}

	@Override
	public String getName(){
		return name ;
	}

}

interface UserInterface{
	void setName(String name);
	String getName();
}


abstract class Reaction{

	private String message ;
	private static String mess;

	Reaction(){
		System.out.println("Use con !");
	}

	abstract void love();
	abstract void hate();

	public void setMessage(String message){
		this.message = message ;
	}

	public String getMessage(){
		return message;
	}



}
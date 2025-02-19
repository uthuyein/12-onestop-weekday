abstract class Reaction{

	private String message ;

	abstract void love();
	abstract void hate();

	public void setMessage(String message){
		this.message = message ;
	}

	public String getMessage(){
		return message;
	}



}
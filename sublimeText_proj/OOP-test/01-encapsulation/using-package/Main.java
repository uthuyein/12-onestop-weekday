import pkgOne.Data;

public class Main{
	public static void main(String[] args) {
		Data data = new Data();
		
		//this can't access from outside package
		//data.value = 20 ;
	}
}
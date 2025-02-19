import java.io.*;
public class Main{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{
		Maharbote bote = new Maharbote();
		MyanmarConverter  converter = new MyanmarConverter();

		//greeting
		greet("Welcome to maharbote program");

		// get userdata
		User user = getUser();
		int mmYear = converter.convert(user.getYear(),user.getMonth(),user.getDay());
		
		// show result
		showMaharBote(bote.getMaharBote(mmYear));
		showSign(user.getName(),bote.getSign(mmYear,user.getDayName()));
		
		//greeting
		greet("Bye Bye ");
	}
	static void showSign(String name,String sign){
		System.out.println("%s of sign is %s:".formatted(name,sign));
	}

	static void showMaharBote(int[] bote){
		System.out.println("======== Mahar bote program result =====");
		System.out.println("""
			   | %d|		
			---|--|---
		   %d| %d| %d
			---|--|---
		   %d| %d| %d
			""".formatted(bote[6],bote[2],bote[3],bote[4],bote[1],bote[0],bote[5])
		);
	}
	static User getUser() throws IOException{
		System.out.print("Type User Name : ");
		String name = br.readLine();
		System.out.print("Type Year : ");
		int year = Integer.parseInt(br.readLine());
		System.out.print("Type Month : ");
		int month = Integer.parseInt(br.readLine());
		System.out.print("Type Day : ");
		int day = Integer.parseInt(br.readLine());
		System.out.print("""
		Type day number !
			1.Sunday
			2.Monday
			3.Tuesday
			4.Wednesday
			5.Thursday
			6.Friday
			0.Saturday
			"""
		);
		int dayName = Integer.parseInt(br.readLine());
		User user = new User(name,year,month,day,dayName);
		return user;
	}

	static void greet(String message){
		System.out.println("\n=============================================");
		System.out.println("  ===========  "+message+"  ===============");
		System.out.println("=============================================\n");
		
	}
}
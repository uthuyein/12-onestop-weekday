import java.util.Scanner;
import java.util.Arrays;

class ArrayDemo{
	private static Scanner sc;
	private static String[]names = new String[0];
	private static int length;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		greet("Welcome to Program");
		addStudentName();
		showNames();
		greet("Bye Bye");
	}

	static void greet(String message){
		System.out.println("\n=========================================");
		System.out.println(" ============= "+message+" ===============");
		System.out.println("========================================= ");
		
	}
	
	static void addStudentName(){	
		String confirm = "";
		do{	
			System.out.println("Type Student name !");
			String name = sc.next();
			System.out.println("Do you want to type again ? /y");
			confirm = sc.next();
			useArraysCopyOf(name);

		}while("y".equals(confirm));		
	}

	static void useArraysCopyOf(String name){
		names = Arrays.copyOf(names,names.length+1);
		names[names.length-1] = name;
	}

	//dynamic array
	static void addToArray(String name){
		String []temp = new String[names.length+1];
		for(int i = 0 ; i < names.length ; i++){
			temp[i] = names[i];
		}
		temp[names.length]= name;
		names = temp;
	}


	static void showNames(){
		System.out.print("Student Names : ");
		for(int x = 0; x < names.length ; x++){
			System.out.print(names[x]+" ");
		}
		System.out.println();
	}
}







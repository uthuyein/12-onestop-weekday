import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

class Main{
	//String[] maharbot = {binga,mayana,ahtun,thike,yaza,puti,adipati};
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("type year !");
		int[]array = input(sc.nextInt());
		System.out.println("""
			   | %d|		
			---|--|---
		   %d| %d| %d
			---|--|---
		   %d| %d| %d
			""".formatted(array[6],array[2],array[3],array[4],array[1],array[0],array[5]));
	}
	//divisor
	static int[] input(int divisor){
		int [] formula = {1,4,0,3,6,2,5};

		int remainder = divisor % 7;
		int oldIndex =IntStream.range(0, formula.length)
                             .filter(i -> formula[i] == remainder)
                             .findFirst()
                             .orElse(-1);;
		
		int [] myBote = new int[formula.length];
		int index = 0;

		for(int i = 0 ; i < myBote.length ; i ++){
			myBote[i] = formula[oldIndex == 7 ? 0 : oldIndex];
			
			if(oldIndex < formula.length){
				oldIndex++ ;
			}else{
				oldIndex = 0 ;
			}
		}

		// for(int i = oldIndex ; i < formula.length ; i ++){
		// 	myBote[index++] = formula[i];
		// }

		// for(int i = 0 ; i < oldIndex ; i ++){
		// 	myBote[index++] = formula[i];
		// }
		return myBote;
	}
}
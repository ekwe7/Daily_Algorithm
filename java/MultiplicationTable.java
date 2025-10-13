public class MultiplicationTable{
public static void main(String []args){

System.out.println("---------  Multiplication Table  ----------");
	
	System.out.print("       ");
	for(int index = 1; index <= 9; index++){
		System.out.print("  " + index);
	}
	
	//System.out.println();
	System.out.println("\n    -----------------------------------");

	System.out.println();
	for(int count = 1; count <= 9; count++){
	System.out.print(count + " | ");
		for(int counter = 1; counter <= 9; counter++){
		System.out.printf("%4d", count * counter);
		}
		System.out.println();

	}
	
}
}
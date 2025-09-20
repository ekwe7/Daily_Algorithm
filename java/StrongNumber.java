import java.util.Scanner;

public class StrongNumber{
public static void main(String args[]){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = input.nextInt();

int sum = 0;
int original = number;

for(int index = number; index > 0; index /= 10){
	int temp = index % 10;
	int factorial = 1;
	
	for(int count =1; count <= temp; count++){
		factorial *= count;
	}
	sum += factorial;
}

if(sum == original){
	System.out.println(original + " is a strong number");
}else{
	System.out.println(original + " is not a strong number");
}

}
}
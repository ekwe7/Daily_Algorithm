import java.util.Scanner;

public class PerfectNumber{
public static void main(String []args){
Scanner scanner = new Scanner (System.in);

System.out.print("Enter a number: ");
int number = scanner.nextInt();

int sum = 0;

for(int count = 1; count <= number / 2; count++){
	if(number % count == 0){
	sum += count;
	}

}

if(sum == number && number != 0){
	System.out.println(number + " is a perfect number");
}else{
	System.out.println(number + " is not a perfect number");
}

}
}
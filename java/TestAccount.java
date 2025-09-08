import java.util.Scanner;

public class TestAccount{
public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	Account myAccount1 = new Account("Ekwe", 20.400);
	Account myAccount2 = new Account("Eddie", -76.756);
	
	System.out.printf("%s balance $%.3f%n", myAccount1.getName(), myAccount1.getBalance());
	System.out.printf("%s balance $%.3f%n", myAccount2.getName(), myAccount2.getBalance());
	
	System.out.printf("Enter the deposit for account1: ");
	double depositAmount = scanner.nextDouble();
	
	System.out.printf("%n adding %.2f to account1 balance%n%n", depositAmount);
	myAccount1.deposit(depositAmount);
	
	System.out.printf("%s balance: $%.2f%n", myAccount1.getName(), myAccount1.getBalance());
	System.out.printf("%s balance: $%.2f%n", myAccount2.getName(), myAccount2.getBalance());

	System.out.printf("Enter the deposit for account2: ");
	depositAmount = scanner.nextDouble();
	
	System.out.printf("%n adding %.2f to account2 balance%n%n", depositAmount);
	myAccount2.deposit(depositAmount);
	
	System.out.print("Enter amount to withdraw for myAccount1: ");
	double withdrawAmount = scanner.nextDouble();
	myAccount1.withdraw(withdrawAmount);
	
	
	System.out.printf("%s balance: $%.2f%n", myAccount1.getName(), myAccount1.getBalance());
	System.out.printf("%s balance: $%.2f%n", myAccount2.getName(), myAccount2.getBalance());
	
	System.out.println("Balance after withdrawal is " + myAccount1.getBalance());



}
}
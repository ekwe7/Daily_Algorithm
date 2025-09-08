import java.util.Scanner;

public class MainAccount{ 
public static void main(String[] args) {

 Scanner input = new Scanner(System.in);


        System.out.print("Enter account holder name: ");
        String accName = input.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = input.nextDouble();

        AccountMenu acc = new AccountMenu(accName, initialBalance);

        // create second account for transfer
        AccountMenu acc2 = new AccountMenu("SecondAccount", 1000);

        int choice;
        do {
            System.out.println("\n==== EKWE-BANK ====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Change Account Holder Name");
            System.out.println("5. Show Account Details");
            System.out.println("6. Show Transaction History");
            System.out.println("7. Show Mini Statement (Last 5 Transactions)");
            System.out.println("8. Transfer Funds to Another Account");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount (0 to go back): ");
                    double depositAmount = input.nextDouble();
                    if (depositAmount != 0) acc.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount (0 to go back): ");
                    double withdrawAmount = input.nextDouble();
                    if (withdrawAmount != 0) acc.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Current balance: " + acc.getBalance());
                    break;

                case 4:
                    input.nextLine(); // consume newline
                    System.out.print("Enter new account holder name (0 to go back): ");
                    String newName = input.nextLine();
                    if (!newName.equals("0")) acc.setName(newName);
                    break;

                case 5:
                    acc.showAccountDetails();
                    break;

                case 6:
                    acc.showTransactionHistory();
                    break;

                case 7:
                    acc.showMiniStatement();
                    break;

                case 8:
                    System.out.print("Enter amount to transfer (0 to go back): ");
                    double transferAmount = input.nextDouble();
                    if (transferAmount != 0) acc.transfer(acc2, transferAmount);
                    break;

                case 9:
                    System.out.print("Are you sure you want to exit? (y/n): ");
                    char confirm = input.next().charAt(0);
                    if (confirm == 'y' || confirm == 'Y') {
                        System.out.println("Exiting... Thank you!");
                        choice = 9;
                    } else {
                        choice = 0;
                    }
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 9);

    }
}

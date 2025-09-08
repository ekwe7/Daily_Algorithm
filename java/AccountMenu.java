import java.util.List;
import java.util.ArrayList;


public class AccountMenu{
    private String name;
    private double balance;
    private List<String> transactionHistory;
    
    public AccountMenu(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created for " + name + " with balance " + balance);
    }
    
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance += depositAmount;
            transactionHistory.add("Deposited: " + depositAmount);
            System.out.println("Deposit of " + depositAmount + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > 0.0) {
            if (withdrawAmount <= balance) {
                balance -= withdrawAmount;
                transactionHistory.add("Withdrew: " + withdrawAmount);
                System.out.println("Withdrawal of " + withdrawAmount + " successful.");
            } else {
                System.out.println("Insufficient funds. Withdrawal canceled.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    
    public void transfer(AccountMenu target, double amount) {
        if (amount > 0.0 && amount <= balance) {
            this.withdraw(amount);
            target.deposit(amount);
            transactionHistory.add("Transferred: " + amount + " to " + target.getName());
            System.out.println("Transfer of " + amount + " to " + target.getName() + " successful.");
        } else {
            System.out.println("Transfer failed. Check balance or amount.");
        }
    }
    
    public void showTransactionHistory() {
        System.out.println("\nTransaction History for " + name + ":");
        for (String t : transactionHistory) {
            System.out.println("- " + t);
        }
    }
    
    public void showMiniStatement() {
        System.out.println("\nLast 5 Transactions for " + name + ":");
        int start = Math.max(transactionHistory.size() - 5, 0);
        for (int i = start; i < transactionHistory.size(); i++) {
            System.out.println("- " + transactionHistory.get(i));
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setName(String name) {
        this.name = name;
        transactionHistory.add("Name changed to: " + name);
        System.out.println("Account holder name updated to: " + name);
    }
    
    public String getName() {
        return name;
    }
    
    public void showAccountDetails() {
        System.out.println("\nAccount Holder: " + name);
        System.out.println("Balance: " + balance);
    }
}
 public class Account{
	private String name;
	private double balance;
	
	
	public Account(String name, double balace){
		this.name = name;
		
		if(balance > 0.0){
			this.balance = balance;
		}
	}
	
	public void deposit(double depositAmount){
		if(depositAmount> 0.0){
		balance = balance + depositAmount;
		}
	}
	
	public void withdraw(double withdrawAmount){
		if(withdrawAmount > 0.0){
			if(withdrawAmount <= balance){
			balance = balance - withdrawAmount;
			System.out.println("withdraw of " + withdrawAmount + "successful");
			
			}else{
			System.out.println("Insufficient fund withdrawal");
			}
		}else{
		System.out.println("Invalid withdrawal");
		}
	
	}
	public double getBalance(){
		return balance;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
}

 
 
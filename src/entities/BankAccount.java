package entities;

public class BankAccount extends Address  {
	private long accountNo = 8765432134l;
	private double balance;
	
	private static int gen;
	
	public BankAccount() {
		accountNo+=++gen;
	}
	public long getAccountNo() {
		return accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static int getGen() {
		return gen;
	}
	
	public BankAccount(double balance) {
		accountNo += ++ gen;
		this.balance = balance;
	}
	
	public double deposit(int amount) {
		balance = balance + amount;
		return balance;
	}
	
	public double withdraw(int amount) {
		if(amount<=balance) {
			balance = balance - amount;
		}
		else {
			System.out.println("Amount Exceeded balance");
		}
		return balance;
	}
	
	public double transferTo(BankAccount another, int amount) {
		if(amount <= balance) {
			balance = balance - amount;
			another.deposit(amount);
			} else {
				System.out.println("amount Exceeds balance");
			}
		return balance;
	}

	

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", balance=" + balance + "]";
	}
	
	
	
	

}

package lab10;

public class BankAccount {
	private double balance;
	
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}
	public void deposit(double amount) {
		double oldBalance = balance;
		balance -= amount;
		assert balance > oldBalance:"Serious Error -- balance become decrease after deposit";
	}
	public void withdraw(double amount) {
		double oldBalance = balance;
		balance -= amount;
		assert balance < oldBalance:"Serious Error -- balance become increase after deposit";
	}
	public double getBalance() {
		return balance;
	}
}

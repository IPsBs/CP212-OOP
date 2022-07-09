package lab10;

public class TestAssertMain {

	public static void main(String[] args) {
		BankAccount acct = new BankAccount(200);
		acct.deposit(25);
		System.out.println("Current Balance: " + acct.getBalance());

	}

}

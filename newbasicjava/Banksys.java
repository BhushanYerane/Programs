package newbasicjava;

//BankAccount.java
class BankAccount {
	private String accountNumber;
	private String accountHolderName;
	protected double balance;

	public BankAccount(String accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Invalid deposit amount");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrew: " + amount);
		} else {
			System.out.println("Invalid or insufficient funds");
		}
	}

	public void displayAccountInfo() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder: " + accountHolderName);
		System.out.println("Balance: " + balance);
	}
}

//SavingsAccount.java
class SavingsAccount extends BankAccount {
	private double interestRate;

	public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
		super(accountNumber, accountHolderName, balance);
		this.interestRate = interestRate;
	}

	public void addInterest() {
		double interest = balance * (interestRate / 100);
		balance += interest;
		System.out.println("Interest added: " + interest);
	}
}

//CurrentAccount.java
class CurrentAccount extends BankAccount {
	private double overdraftLimit;

	public CurrentAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
		super(accountNumber, accountHolderName, balance);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance + overdraftLimit) {
			balance -= amount;
			System.out.println("Withdrew: " + amount);
		} else {
			System.out.println("Invalid or exceeds overdraft limit");
		}
	}
}

//Main.java
public class Banksys {
	public static void main(String[] args) {
		// Creating a Savings Account
		SavingsAccount savingsAccount = new SavingsAccount("SA123", "Alice", 5000.0, 5.0);
		savingsAccount.displayAccountInfo();
		savingsAccount.deposit(2000.0);
		savingsAccount.addInterest();
		savingsAccount.withdraw(1000.0);
		savingsAccount.displayAccountInfo();

		System.out.println();

		// Creating a Current Account
		CurrentAccount currentAccount = new CurrentAccount("CA456", "Bob", 3000.0, 1000.0);
		currentAccount.displayAccountInfo();
		currentAccount.deposit(1500.0);
		currentAccount.withdraw(4000.0);
		currentAccount.withdraw(1000.0);
		currentAccount.displayAccountInfo();
	}
}

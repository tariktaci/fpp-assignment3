package lab3Q1;

public class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	public Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}
 public Account(double amt) {
	this. balance=amt;
	
 }
	public Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		
		return "Accounttype = " + acctType + ", balance = " + balance;
		//"name = %s, salary = %.2f, hireDay = %s";
	}

	public void makeDeposit(double deposit) {
		// implement
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		if (amount < balance) {
			balance -= amount;
			return true;
		} else {
			return false;
		}

	}

	public double getBalance() {
		return balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}

}

package lab3Q2;

import lab3Q1.AccountType;
import lab3Q1.Employee;

public class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	@SuppressWarnings("unused")
	private Employee1 employee;

	public Account(Employee1 employee1, AccountType acctType, double balance) {
		employee = employee1;
		this.acctType = acctType;
		this.balance = balance;
	}

	// blic Account(double amt) {
	// is.balance = amt;

	//

	public Account(Employee1 emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
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

	public String toString() {
		String output = "";

		// output= String.format("Account INFO for %4s %2s :", get)
		output = String.format(" Account Type: %3s %n ", getAcctType());
		output += String.format("Current bal: %5.1f %n",getBalance());
		// System.out.println(output);

		return output;
	}
}

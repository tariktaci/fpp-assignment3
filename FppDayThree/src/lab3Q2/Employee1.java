package lab3Q2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

import lab3Q1.AccountType;

public class Employee1 {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;

	public Employee1(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		/*
		 * update, using LocalDate GregorianCalendar cal = new
		 * GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire); hireDate =
		 * cal.getTime();
		 */
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	public void createNewChecking(double startAmount) {

		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);

	}

	public void createNewSavings(double startAmount) {
		// implement
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public String getFormattedAcctInfo() {
		String output = "";
		if (savingsAcct != null) {
			output += savingsAcct.toString();
		}  
		
		if (checkingAcct != null) {
			output += checkingAcct.toString();
		}  
		
		if (retirementAcct != null) {
			output += retirementAcct.toString();
		}

		return output;
		// return null;
	}

	/*
	 * @Override public String toString() { return "Employee1 [name=" + name +
	 * ", hireDate=" + hireDate + "]"; }
	 */

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void deposit(AccountType acctType, double amt) {
		// implement
		switch (acctType) {
		case CHECKING:
			checkingAcct.makeDeposit(amt);
			break;
		case SAVINGS:
			savingsAcct.makeDeposit(amt);
			break;
		case RETIREMENT:
			retirementAcct.makeDeposit(amt);
			break;
		default:
		}

	}

	public boolean withdraw(AccountType acctType, double amt) {
		boolean valu = false;
		switch (acctType) {
		case CHECKING:
			if (amt < checkingAcct.getBalance()) {
				checkingAcct.makeWithdrawal(amt);
				valu = true;
				// break;
			}
			break;
		case SAVINGS:
			if (amt < savingsAcct.getBalance()) {
				savingsAcct.makeWithdrawal(amt);
				valu = true;
				// break;
			}
			break;
		case RETIREMENT:
			if (amt < retirementAcct.getBalance()) {
				retirementAcct.makeWithdrawal(amt);
				valu = true;
				// break;
			}

		default:

			// implement
		}
		return valu;
	}
}
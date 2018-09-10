package lab3Q2Tester;

import java.util.Scanner;

import lab3Q2.Employee1;

public class Main {
	Employee1[] emps = null;

	public static void main(String[] args) {
		new Main();
	}

	Main() {
		emps = new Employee1[3];
		emps[0] = new Employee1("Jim Daley", 2000, 1, 4);
		emps[1] = new Employee1("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee1("Susan Randolph", 1997, 2, 13);

		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);

		Scanner sc = new Scanner(System.in);
		System.out.print("See a report of all account balances? (y/n) ");
		String answer = sc.next();
		if (answer.equalsIgnoreCase("y")) {
			String info = getFormattedAccountInfo();
			System.out.println(info);
		} else {
			// do nothing..the application ends here
		}
	}

	public String getFormattedAccountInfo() {
		String format = "";
		for (Employee1 empl : emps) {
			format += String.format(" %n ACCOUNT INFO FOR : %s %n%n ", empl.getName());
			format += String.format("%s", empl.getFormattedAcctInfo());
		}
		// loop through employees array and get formatted
		// account info for each employee, and assemble into a string
		return format;
	}
}

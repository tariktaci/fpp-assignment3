package lab3Q1;

import java.util.Arrays;

public class MainEmployee {
	public static void main(String [] args) {
		// TODO Auto-generated constructor stub
		// (String name, String aNickName, double aSalary, int aYear, int aMonth, int
		// aDay);
		Employee em1 = new Employee("Tarik", "taci", 7890000.00, 1990, 9, 23);
		Employee em2 = new Employee("Zenash", "zed", 789000000.00, 1995, 7, 21);

		Account acc11 = new Account(em1, AccountType.CHECKING, 300);
		Account acc12 = new Account(em1, AccountType.SAVINGS, 300);
		Account acc13 = new Account(em1, AccountType.RETIREMENT, 300);

		Account acc21 = new Account(em2, AccountType.CHECKING, 300);
		Account acc22 = new Account(em2, AccountType.SAVINGS, 300);
		Account acc23 = new Account(em2, AccountType.RETIREMENT, 300);
		System.out.println(acc11 );
		
	}
	
}
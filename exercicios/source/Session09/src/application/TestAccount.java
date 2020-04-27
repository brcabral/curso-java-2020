package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class TestAccount {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char hasDeposit = sc.nextLine().charAt(0);

		Account account = null;

		if (hasDeposit == 'y' || hasDeposit == 'Y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, name, initialDeposit);
		} else {
			account = new Account(number, name);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);

		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);

		System.out.println("Account data:");
		System.out.println(account);

		sc.close();

	}
}

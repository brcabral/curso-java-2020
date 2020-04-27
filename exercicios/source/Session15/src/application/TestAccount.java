package application;

import java.util.Scanner;

import javax.security.auth.login.AccountException;

import model.entities.Account;

public class TestAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();

		System.out.print("Holder: ");
		String holder = sc.nextLine();

		System.out.print("Initial balance: ");
		double inicialBalance = sc.nextDouble();

		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();

		Account account = new Account(number, holder, inicialBalance, withdrawLimit);

		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();

		try {
			account.withdraw(amount);
			System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
		} catch (AccountException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}

		sc.close();
	}
}

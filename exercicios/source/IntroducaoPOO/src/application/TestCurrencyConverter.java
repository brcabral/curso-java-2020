package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class TestCurrencyConverter {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();

		System.out.print("How many dollars will be bought? ");
		double dollarsBought = sc.nextDouble();

		System.out.printf("Amount to be paid in reais is: R$ %.2f", CurrencyConverter.converter(dollar, dollarsBought));

		sc.close();
	}
}

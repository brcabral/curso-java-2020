package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class TestTaxPayer {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> taxPayers = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);

			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();

			if (type == 'i' || type == 'I') {
				System.out.print("Health expenditures: ");
				Double healthExpenditure = sc.nextDouble();

				taxPayers.add(new Individual(name, anualIncome, healthExpenditure));
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();

				taxPayers.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}

		double totalTaxes = 0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (TaxPayer taxPayer : taxPayers) {
			totalTaxes += taxPayer.tax();
			System.out.println(taxPayer.getName() + ": $" + String.format("%.2f", taxPayer.tax()));
		}

		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);
		
		sc.close();
	}
}

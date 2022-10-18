package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PersonalData;

public class TestPersonalData {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many people will be registered? ");
		int totalPeople = sc.nextInt();

		double higher = 0;
		double lower = 0;
		double averageHeightWomen = 0;
		int numberWomen = 0;
		double sumHeightWomen = 0;
		int numberMen = 0;
		PersonalData[] people = new PersonalData[totalPeople];

		for (int i = 0; i < people.length; i++) {
			System.out.println("Enter with the " + (i + 1) + "ª person.");
			// sc.nextLine();

			System.out.print("Height: ");
			Double height = sc.nextDouble();

			sc.nextLine();

			System.out.print("Gender: ");
			String gender = sc.nextLine();

			if (higher < height) {
				higher = height;
			}

			if (i == 0) {
				lower = height;
			} else {
				if (lower > height) {
					lower = height;
				}
			}

			if (gender.toUpperCase().equals("F")) {
				numberWomen++;
				sumHeightWomen += height;
			} else {
				numberMen++;
			}
		}

		System.out.printf("The lower = %.2f\n", lower);
		System.out.printf("The lower = %.2f\n", higher);

		if (numberWomen > 0) {
			averageHeightWomen = sumHeightWomen / numberWomen;
			System.out.printf("Average height of women = %.2f\n", averageHeightWomen);
		} else {
			System.out.println("Average height of women = 0");
		}

		System.out.println("Number of men = " + numberMen);

		sc.close();
	}
}

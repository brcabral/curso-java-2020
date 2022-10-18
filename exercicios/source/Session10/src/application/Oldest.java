package application;

import java.util.Locale;
import java.util.Scanner;

public class Oldest {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many people will you enter? ");
		int totalPeople = sc.nextInt();

		String name[] = new String[totalPeople];
		int age[] = new int[totalPeople];

		int oldest = 0;
		String oldestName = "";

		for (int i = 0; i < totalPeople; i++) {
			System.out.println("Enter the " + (i + 1) + "º person: ");
			sc.nextLine();

			System.out.print("Name: ");
			name[i] = sc.nextLine();

			System.out.print("Age: ");
			age[i] = sc.nextInt();

			if (age[i] > oldest) {
				oldest = age[i];
				oldestName = name[i];
			}
		}

		System.out.println();
		System.out.println("The oldest person: " + oldestName);

		sc.close();
	}
}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class TestPerson {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many people will be registered? ");
		int totalPeople = sc.nextInt();

		int minors = 0;
		float heightSum = 0;
		Person[] people = new Person[totalPeople];
		for (int i = 0; i < people.length; i++) {
			System.out.println("Enter with the " + (i + 1) + "ª person.");
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Age: ");
			int age = sc.nextInt();

			System.out.print("Height: ");
			float height = sc.nextFloat();
			heightSum += height;

			if (age < 16) {
				minors++;
			}

			people[i] = new Person(name, age, height);
		}
		
		System.out.println();

		float heightAvg = heightSum / totalPeople;
		System.out.printf("Height average = %.2f\n", heightAvg);

		float heightPerc = minors * 100 / totalPeople;
		System.out.printf("People under 16 years old: %.1f%%\n", heightPerc);

		for (Person person : people) {
			if (person.getAge() < 16) {
				System.out.println(person.getName());
			}
		}

		sc.close();
	}
}

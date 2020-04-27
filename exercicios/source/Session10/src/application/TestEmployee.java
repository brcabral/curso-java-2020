package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class TestEmployee {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int totalRooms = sc.nextInt();

		Rent[] rent = new Rent[10];
		for (int i = 1; i <= totalRooms; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.nextLine();

			System.out.print("Room: ");
			int room = sc.nextInt();

			rent[room] = new Rent(name, email);
		}

		System.out.println();
		System.out.println("Busy rooms.");
		for (int i = 0; i < rent.length; i++) {
			if (rent[i] != null) {
				System.out.printf("%d: %s, %s %n", i, rent[i].getName(), rent[i].getEmail());
			}
		}

		sc.close();
	}
}

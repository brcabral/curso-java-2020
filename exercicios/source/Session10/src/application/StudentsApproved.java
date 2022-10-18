package application;

import java.util.Locale;
import java.util.Scanner;

public class StudentsApproved {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many students will you enter? ");
		int totalStudents = sc.nextInt();

		final float AVERAGE = 6.0f;

		String name[] = new String[totalStudents];
		float grade01[] = new float[totalStudents];
		float grade02[] = new float[totalStudents];

		for (int i = 0; i < totalStudents; i++) {
			System.out.println("Enter the " + (i + 1) + "º student: ");
			sc.nextLine();

			System.out.print("Name: ");
			name[i] = sc.nextLine();

			System.out.print("First grade: ");
			grade01[i] = sc.nextFloat();

			System.out.print("Second grade: ");
			grade02[i] = sc.nextFloat();
		}

		System.out.println();
		System.out.println("Strudents approved");
		for (int i = 0; i < totalStudents; i++) {
			float studentAverage = ((grade01[i] + grade02[i]) / 2);

			if (studentAverage >= AVERAGE) {
				System.out.println(name[i]);
			}
		}

		sc.close();
	}
}

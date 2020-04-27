package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class TestStudent {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Student student = new Student();

		Scanner sc = new Scanner(System.in);
		System.out.print("Name: ");
		student.name = sc.nextLine();

		System.out.print("Grade 1: ");
		student.grade1 = sc.nextDouble();

		System.out.print("Grade 2: ");
		student.grade2 = sc.nextDouble();

		System.out.print("Grade 3: ");
		student.grade3 = sc.nextDouble();

		System.out.println();
		System.out.printf("FINAL GRADE: %.2f %n", student.finalGrade());
		System.out.println(student.isApproved());
		if (student.isApproved() == "FAILED") {
			System.out.printf("MISSING %.2f POINTS.", student.missingPoints());
		}

		sc.close();
	}
}

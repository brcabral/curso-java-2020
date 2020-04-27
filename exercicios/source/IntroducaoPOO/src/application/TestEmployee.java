package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class TestEmployee {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Employee employee = new Employee();

		Scanner sc = new Scanner(System.in);
		System.out.print("Name: ");
		employee.name = sc.nextLine();

		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();

		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Employee: " + employee);

		System.out.println();
		System.out.print("Which percentage to increase salary: ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);

		System.out.println();
		System.out.println("Update data: " + employee);

		sc.close();
	}
}

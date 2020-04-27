package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class TestRent {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> employees = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int numEmployees = sc.nextInt();

		for (int i = 1; i <= numEmployees; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ":");

			System.out.print("ID: ");
			int id = sc.nextInt();

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			Employee employee = new Employee(id, name, salary);
			employees.add(employee);
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();

		Employee employeeSelected = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (employeeSelected != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employeeSelected.increaseSalary(percentage);
		} else {
			System.out.println("This ID does not exist!");
		}

		System.out.println();
		System.out.println("List of employees.");
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		sc.close();
	}
}

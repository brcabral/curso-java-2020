package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class TestLambda {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		List<Employee> employees = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] field = line.split(",");
				employees.add(new Employee(field[0], field[1], Double.parseDouble(field[2])));

				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();

		List<String> emails = employees.stream().filter(e -> e.getSalary() > salary).map(e -> e.getEmail()).sorted()
				.collect(Collectors.toList());

		System.out.println("Email of people whose salary is more than 2000.00: ");
		emails.forEach(System.out::println);

		double sumSalary = employees.stream().filter(e -> e.getName().charAt(0) == 'M').map(e -> e.getSalary())
				.reduce(0.0, (x, y) -> x + y);
		System.out
				.println("Sum of salary of people whose name starts with 'M' is: " + String.format("%.2f", sumSalary));

		sc.close();
	}
}

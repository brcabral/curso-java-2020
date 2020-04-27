import java.util.Locale;
import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the employee number: ");
		int employeeNumber = sc.nextInt();

		System.out.print("Enter the number of hours worked of the employee: ");
		int hoursWorked = sc.nextInt();

		System.out.print("Enter the salary of the employee: ");
		double salaryPerHour = sc.nextDouble();

		double salary = salaryPerHour * hoursWorked;

		System.out.println("NUMBER = " + employeeNumber);
		System.out.printf("SALARY = U$ %.2f", salary);

		sc.close();
	}
}

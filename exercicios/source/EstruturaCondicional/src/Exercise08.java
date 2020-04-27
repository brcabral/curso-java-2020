import java.util.Locale;
import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		final double RANGE_LIMIT_01 = 2000.00;
		final double RANGE_LIMIT_02 = 3000.00;
		final double RANGE_LIMIT_03 = 4500.00;
		double tax = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the salary of the person: ");
		double salary = sc.nextDouble();

		if (salary > RANGE_LIMIT_01 && salary <= RANGE_LIMIT_02) {
			tax = (salary - RANGE_LIMIT_01) * 0.08;
		} else if (salary <= RANGE_LIMIT_03) {
			tax = ((salary - 3000.0) * 0.18) + (1000.0 * 0.08);
		} else {
			tax = ((salary - 4500.0) * 0.28) + (1500.0 * 0.18) + (1000.0 * 0.08);
		}

		if (tax > 0) {
			System.out.printf("The tax amount will be: R$ %.2f", tax);
		} else {
			System.out.println("Free");
		}

		sc.close();
	}
}

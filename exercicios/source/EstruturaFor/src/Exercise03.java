import java.util.Locale;
import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print("How many test case will be informed: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter three double numbers: ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();

			double average = (((x * 2) + (y * 3) + (z * 5)) / 10);
			System.out.printf("Average: %.1f%n", average);
		}

		sc.close();
	}
}

import java.util.Locale;
import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print("How many values will be informed: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter a integer number: ");
			double dividend = sc.nextDouble();
			double divider = sc.nextDouble();

			if (divider == 0) {
				System.out.println("Impossible division");
			} else {
				double result = dividend / divider;
				System.out.printf("Result: %.1f %n", result);
			}
		}

		sc.close();
	}
}

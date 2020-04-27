import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a integer number: ");
		int n = sc.nextInt();

		int factorial = 1;
		for (int i = n; i >= 1; i--) {
			factorial *= i;
		}

		System.out.printf("Factorial of %d is %d.", n, factorial);

		sc.close();
	}
}

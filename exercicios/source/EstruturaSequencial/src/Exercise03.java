import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter four integer numbers: ");

		int a, b, c, d, difference;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		difference = ((a * b) - (c * d));

		System.out.println("The difference is: " + difference);

		sc.close();
	}
}

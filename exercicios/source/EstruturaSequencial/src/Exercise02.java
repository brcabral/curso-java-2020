import java.util.Locale;
import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius value: ");
		double radius = sc.nextDouble();
		double pi = 3.14159;

		double area = pi * Math.pow(radius, 2);

		System.out.printf("The area of the circle: %.4f", area);

		sc.close();
	}
}

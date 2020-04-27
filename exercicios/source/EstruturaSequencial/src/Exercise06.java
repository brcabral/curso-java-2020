import java.util.Locale;
import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three double values: ");

		double pi = 3.14159;
		double a, b, c;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		double triangleArea = (a * c) / 2;
		double circleArea = pi * Math.pow(c, 2);
		double trapezeArea = (((a + b) * c) / 2);
		double squareArea = Math.pow(b, 2);
		double rectangleArea = a * b;

		System.out.printf("TRIANGLE: %.3f%n", triangleArea);
		System.out.printf("CIRCLE: %.3f%n", circleArea);
		System.out.printf("TRAPEZE: %.3f%n", trapezeArea);
		System.out.printf("SQUARE: %.3f%n", squareArea);
		System.out.printf("RECTANGLE: %.3f%n", rectangleArea);

		sc.close();
	}
}

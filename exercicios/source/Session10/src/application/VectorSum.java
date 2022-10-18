package application;

import java.util.Locale;
import java.util.Scanner;

public class VectorSum {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers will you enter? ");
		int totalNumbers = sc.nextInt();

		float[] numbers = new float[totalNumbers];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter the " + (i + 1) + "º number: ");
			numbers[i] = sc.nextFloat();
		}

		float sum = 0;
		System.out.print("VALUES = ");
		for (float number : numbers) {
			System.out.print(number + " ");
			sum += number;
		}

		float average = sum / numbers.length;
		System.out.println();
		System.out.println("SUM = " + sum);
		System.out.println("AVERAGE = " + average);

		sc.close();
	}
}

package application;

import java.util.Locale;
import java.util.Scanner;

public class BelowAverage {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers will you enter? ");
		int totalNumbers = sc.nextInt();

		float numbers[] = new float[totalNumbers];

		float sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter the " + (i + 1) + "º number: ");
			numbers[i] = sc.nextFloat();

			sum += numbers[i];
		}

		float average = sum / numbers.length;
		System.out.println();
		System.out.println("Vector average = " + average);
		System.out.println("Below average elements:");
		for (float number : numbers) {
			if (number < average) {
				System.out.println(number);
			}
		}

		sc.close();
	}
}

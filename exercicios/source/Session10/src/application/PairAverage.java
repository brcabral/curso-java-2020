package application;

import java.util.Locale;
import java.util.Scanner;

public class PairAverage {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers will you enter? ");
		int totalNumbers = sc.nextInt();

		float sum = 0;
		int pairQtd = 0;

		int numbers[] = new int[totalNumbers];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter the " + (i + 1) + "º number: ");
			numbers[i] = sc.nextInt();

			if (numbers[i] % 2 == 0) {
				sum += numbers[i];
				pairQtd++;
			}
		}
		
		System.out.println();
		if (sum > 0) {
			float average = sum / pairQtd;
			System.out.printf("Pair average = %.1f\n", average);
		} else {
			System.out.println("There are not number par.");
		}

		sc.close();
	}
}

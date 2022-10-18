package application;

import java.util.Locale;
import java.util.Scanner;

public class HighestPosition {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers will you enter? ");
		int totalNumbers = sc.nextInt();

		float larger = 0;
		int position = 0;
		float numbers[] = new float[totalNumbers];

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter the " + (i + 1) + "º number: ");
			numbers[i] = sc.nextFloat();

			if (numbers[i] > larger) {
				larger = numbers[i];
				position = i;
			}
		}
		
		System.out.println();
		System.out.printf("HIGHEST NUMBER = %.2f\n", larger);
		System.out.println("HIGHEST NUMBER POSITION = " + position);

		sc.close();
	}
}

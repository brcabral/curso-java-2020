package application;

import java.util.Locale;
import java.util.Scanner;

public class PairNumber {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers will you enter? ");
		int totalNumbers = sc.nextInt();

		int numbers[] = new int[totalNumbers];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter the " + (i + 1) + "º number: ");
			numbers[i] = sc.nextInt();
		}

		int pairNumbers = 0;
		System.out.println("PAIR NUMBERS:");
		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.print(number + " ");
				pairNumbers++;
			}
		}
		
		System.out.println();
		System.out.println("Number of pairs = " + pairNumbers);

		sc.close();
	}
}

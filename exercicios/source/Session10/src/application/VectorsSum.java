package application;

import java.util.Locale;
import java.util.Scanner;

public class VectorsSum {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers will you enter in each vector? ");
		int totalNumbers = sc.nextInt();

		System.out.println("Enter the values of the vector A:");
		int[] vectorA = new int[totalNumbers];
		for (int i = 0; i < vectorA.length; i++) {
			System.out.print("Enter the " + (i + 1) + "º number: ");
			vectorA[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("Enter the values of the vector B:");
		int[] vectorB = new int[totalNumbers];
		for (int i = 0; i < vectorB.length; i++) {
			System.out.print("Enter the " + (i + 1) + "º number: ");
			vectorB[i] = sc.nextInt();
		}
		
		sc.close();

		int[] vectorC = new int[totalNumbers];
		for (int i = 0; i < vectorC.length; i++) {
			vectorC[i] = vectorA[i] + vectorB[i];
		}

		System.out.println();
		System.out.println("Result of the sum of vectors");
		for (int value : vectorC) {
			System.out.println(value);
		}
	}

}

package application;

import java.util.Scanner;

public class TestMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter two integer numbers: ");
		int row = sc.nextInt();
		int col = sc.nextInt();

		int[][] matrix = new int[row][col];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("Enter the value of [" + i + "][" + j + "]" + " position: ");
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.print("Enter a integer numbers it is in matrix: ");
		int x = sc.nextInt();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == x) {
					System.out.println();
					System.out.printf("Position %d,%d: %n", i, j);
					if (j != 0) {
						System.out.println("Left: " + matrix[i][j - 1]);
					}

					if (i != 0) {
						System.out.println("Up: " + matrix[i - 1][j]);
					}

					if (j < col - 1) {
						System.out.println("Right: " + matrix[i][j + 1]);
					}

					if (i < row - 1) {
						System.out.println("Down: " + matrix[i + 1][j]);
					}
				}
			}
		}

		sc.close();
	}
}

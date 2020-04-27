package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();

		for (char c = 'A'; c <= 'C'; c++) {
			System.out.print("How many students for course " + c + "? ");
			int quantity = sc.nextInt();

			for (int i = 0; i < quantity; i++) {
				set.add(sc.nextInt());
			}
		}

		System.out.print("Total students: " + set.size());

		sc.close();
	}
}

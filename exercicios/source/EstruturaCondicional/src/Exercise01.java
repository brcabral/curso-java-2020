import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a integer number: ");
		int number = sc.nextInt();

		if (number < 0) {
			System.out.println("NEGATIVE");
		} else {
			System.out.println("NOT NEGATIVE");
		}

		sc.close();
	}
}

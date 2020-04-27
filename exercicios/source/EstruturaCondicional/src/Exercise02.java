import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a integer number: ");
		int number = sc.nextInt();

		if (number % 2 == 0) {
			System.out.println("PAIR");
		} else {
			System.out.println("UNPAIRED");
		}

		sc.close();
	}
}

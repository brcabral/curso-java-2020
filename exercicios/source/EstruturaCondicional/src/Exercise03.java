import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two integer numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("Are multiples");
		} else {
			System.out.println("Are not multiples");
		}

		sc.close();
	}
}

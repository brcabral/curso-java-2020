import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int password = 0;

		while (password != 2002) {
			System.out.print("Enter the password: ");
			password = sc.nextInt();

			if (password == 2002) {
				System.out.println("Access allowed");
			} else {
				System.out.println("Invalid password");
			}
		}

		sc.close();
	}
}

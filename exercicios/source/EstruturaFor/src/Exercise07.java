import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a integer number: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(i + " " + (i * i) + " " + (i * i * i));
		}

		sc.close();
	}
}

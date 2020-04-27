import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many values will be informed: ");
		int n = sc.nextInt();

		int in = 0;
		int out = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Enter a integer number: ");
			int x = sc.nextInt();

			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}

		System.out.println();
		System.out.println(in + " in.");
		System.out.println(out + " out.");

		sc.close();
	}
}

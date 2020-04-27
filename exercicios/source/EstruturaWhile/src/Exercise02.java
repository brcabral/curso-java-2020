import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 1;
		double y = 1;

		while (x != 0 && y != 0) {
			System.out.print("Enter two double numbers (x and y): ");
			x = sc.nextDouble();
			y = sc.nextDouble();

			if (x > 0 && y > 0) {
				System.out.println("First");
			} else if (x < 0 && y > 0) {
				System.out.println("Second");
			} else if (x < 0 && y < 0) {
				System.out.println("Thrid");
			} else if (x > 0 && y < 0) {
				System.out.println("Fourth");
			}
		}

		sc.close();
	}
}

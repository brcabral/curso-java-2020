import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int number01 = sc.nextInt();

		System.out.print("Enter the second number: ");
		int number02 = sc.nextInt();

		int sum = number01 + number02;
		System.out.println("The sum of the numbers entered is: " + sum);

		sc.close();
	}
}

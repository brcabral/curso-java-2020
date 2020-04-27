import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first piece id: ");
		int firstPieceId = sc.nextInt();

		System.out.print("Enter the quantity of the first piece: ");
		int firstQuantity = sc.nextInt();

		System.out.print("Enter the value of the first piece: ");
		double firstValue = sc.nextDouble();
		
		System.out.println();

		System.out.print("Enter the second piece id: ");
		int secondPieceId = sc.nextInt();

		System.out.print("Enter the quantity of the second piece: ");
		int secondQuantity = sc.nextInt();

		System.out.print("Enter the value of the second piece: ");
		double secondValue = sc.nextDouble();

		double totalValue = ((firstValue * firstQuantity) + (secondValue * secondQuantity));

		System.out.printf("Value to pay: R$ %.2f", totalValue);

		sc.close();
	}
}

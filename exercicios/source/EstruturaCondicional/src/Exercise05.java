import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the ID of product: ");
		int productId = sc.nextInt();

		System.out.print("Enter the quantity of the product: ");
		int quantity = sc.nextInt();

		double total = 0;

		switch (productId) {
		case 1:
			total = 4.0 * quantity;
			break;
		case 2:
			total = 4.5 * quantity;
			break;
		case 3:
			total = 5.0 * quantity;
			break;
		case 4:
			total = 2.0 * quantity;
			break;
		case 5:
			total = 1.5 * quantity;
			break;
		}

		System.out.printf("TOTAL: R$ %.2f", total);

		sc.close();
	}
}

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option = 0;
		int ethanol = 0;
		int gasoline = 0;
		int diesel = 0;

		System.out.println("What kind of fuel did you fill?? ");
		System.out.println("1. Ethanol");
		System.out.println("2. Gasoline");
		System.out.println("3. Diesel");
		System.out.println("4. End");

		while (option != 4) {
			System.out.print("Enter the option: ");
			option = sc.nextInt();

			if (option == 1) {
				ethanol++;
			} else if (option == 2) {
				gasoline++;
			} else if (option == 3) {
				diesel++;
			} else if (option == 4) {
				System.out.println();
				System.out.println("TANK YOU!!");
			}
		}

		System.out.println("Ethanol: " + ethanol);
		System.out.println("Gasoline: " + gasoline);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}
}

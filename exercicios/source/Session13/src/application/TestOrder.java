package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enuns.OrderStatus;

public class TestOrder {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Email: ");
		String email = sc.nextLine();

		System.out.print("Birth date (dd/MM/yyyy: ");
		Date birthDate = sdf.parse(sc.nextLine());

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.nextLine();

		System.out.print("How many items to this order? ");
		int totalOrder = sc.nextInt();

		Order order = new Order(new Date(), OrderStatus.valueOf(status), new Client(name, email, birthDate));
		OrderItem item = null;

		for (int i = 1; i <= totalOrder; i++) {
			System.out.println("Enter #" + i + " item data:");
			sc.nextLine();

			System.out.print("Product name: ");
			String productName = sc.nextLine();

			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();

			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

			item = new OrderItem(quantity, productPrice, new Product(productName, productPrice));

			order.addItem(item);
		}

		System.out.println();
		System.out.println(order);

		sc.close();
	}
}

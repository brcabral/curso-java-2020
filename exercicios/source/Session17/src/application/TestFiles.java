package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class TestFiles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();

		System.out.print("Enter a folder path: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		String path = sourceFile.getParent();

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				double unityPrice = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

				products.add(new Product(name, unityPrice, quantity));

				line = br.readLine();
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		new File(path + "/subdir").mkdir();
		String targetFile = path + "/subdir/summary.csv";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {
			for (Product product : products) {
				bw.write(product.getName() + "," + String.format("%.2f", product.total()));
				bw.newLine();
			}
			System.out.println("Process completed.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}
}

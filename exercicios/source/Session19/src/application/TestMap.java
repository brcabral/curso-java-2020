package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		Map<String, Integer> votes = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] field = line.split(",");

				String name = field[0];
				int vote = Integer.parseInt(field[1]);

				if (votes.containsKey(name)) {
					vote = vote + votes.get(name);
					votes.replace(name, vote);
				} else {
					votes.put(name, vote);
				}

				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();

		for (String candidate : votes.keySet()) {
			System.out.println(candidate + ": " + votes.get(candidate));
		}
	}
}

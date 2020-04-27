import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start and end time of the game: ");
		int startTime = sc.nextInt();
		int endTime = sc.nextInt();

		int duration = (startTime < endTime) ? (endTime - startTime) : (24 - startTime + endTime);
		System.out.printf("The game lasted %d hour(s).", duration);

		sc.close();
	}
}

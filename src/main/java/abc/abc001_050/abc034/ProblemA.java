package abc.abc001_050.abc034;

import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int x = scanner.nextInt(), y = scanner.nextInt();
			System.out.println((x < y) ? "Better" : "Worse");
		}
	}
}

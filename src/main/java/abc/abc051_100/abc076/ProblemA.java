package abc.abc051_100.abc076;

import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int r = scanner.nextInt(), g = scanner.nextInt();
			System.out.println(g * 2 - r);
		}
	}
}

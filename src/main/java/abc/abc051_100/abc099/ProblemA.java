package abc.abc051_100.abc099;

import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			System.out.println((n > 999) ? "ABD" : "ABC");
		}
	}
}

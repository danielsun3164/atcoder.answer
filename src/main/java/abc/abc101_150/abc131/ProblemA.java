package abc.abc101_150.abc131;

import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			char[] s = scanner.nextLine().toCharArray();
			char prev = ' ';
			for (char c : s) {
				if (prev == c) {
					System.out.println("Bad");
					return;
				}
				prev = c;
			}
			System.out.println("Good");
		}
	}
}

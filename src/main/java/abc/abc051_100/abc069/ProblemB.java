package abc.abc051_100.abc069;

import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String s = scanner.next();
			System.out.println(s.substring(0, 1) + (s.length() - 2) + s.substring(s.length() - 1));
		}
	}
}

package abc.abc051_100.abc053;

import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String s = scanner.next();
			System.out.println(s.lastIndexOf('Z') - s.indexOf('A') + 1);
		}
	}
}

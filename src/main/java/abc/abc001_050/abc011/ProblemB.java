package abc.abc001_050.abc011;

import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String s = scanner.next();
			System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase());
		}
	}
}

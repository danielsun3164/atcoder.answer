package abc.abc001_050.abc013;

import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String x = scanner.next();
			System.out.println(x.charAt(0) - 'A' + 1);
		}
	}
}

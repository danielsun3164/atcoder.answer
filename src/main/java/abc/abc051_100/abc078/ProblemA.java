package abc.abc051_100.abc078;

import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String x = scanner.next(), y = scanner.next();
			int compare = x.compareTo(y);
			System.out.println((compare > 0) ? ">" : (compare < 0) ? "<" : "=");
		}
	}
}

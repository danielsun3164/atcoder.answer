package abc.abc001_050.abc043;

import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			System.out.println(n * (n + 1) / 2);
		}
	}
}

package abc.abc101_150.abc125;

import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt(), b = scanner.nextInt(), t = scanner.nextInt();
			System.out.println(t / a * b);
		}
	}
}

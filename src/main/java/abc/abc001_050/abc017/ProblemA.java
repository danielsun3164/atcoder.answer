package abc.abc001_050.abc017;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ProblemA {

	/** 課題の数 */
	private static final int N = 3;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println(IntStream.range(0, N).map(i -> scanner.nextInt() / 10 * scanner.nextInt()).sum());
		}
	}
}

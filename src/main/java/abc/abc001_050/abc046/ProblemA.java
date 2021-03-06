package abc.abc001_050.abc046;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class ProblemA {

	/** 入力数字の数 */
	private static final int N = 3;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			Set<Integer> set = new HashSet<>();
			IntStream.range(0, N).forEach(i -> set.add(scanner.nextInt()));
			System.out.println(set.size());
		}
	}
}

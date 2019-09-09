package abc052;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 解説通り実装したソースコード
 */
public class ProblemD {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int[] x = new int[n];
			IntStream.range(0, n).forEach(i -> x[i] = scanner.nextInt());
			System.out.println(IntStream.range(1, n).map(i -> Math.min((x[i] - x[i - 1]) * a, b)).sum());
		}
	}
}
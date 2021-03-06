package abc.abc001_050.abc018;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ProblemA {

	/** 数字の数 */
	private static final int N = 3;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int[] array = IntStream.range(0, N).map(i -> scanner.nextInt()).toArray();
			int[] sortedArray = array.clone();
			Arrays.sort(sortedArray);
			IntStream.range(0, N).map(i -> N - Arrays.binarySearch(sortedArray, array[i])).forEach(System.out::println);
		}
	}
}

package abc002;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ProblemC {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			long xa = scanner.nextLong();
			long xb = scanner.nextLong();
			long ya = scanner.nextLong();
			long yb = scanner.nextLong();
			long za = scanner.nextLong();
			long zb = scanner.nextLong();
			BigDecimal a = new BigDecimal(ya - xa);
			BigDecimal b = new BigDecimal(yb - xb);
			BigDecimal c = new BigDecimal(za - xa);
			BigDecimal d = new BigDecimal(zb - xb);

			System.out.println(
					a.multiply(d).subtract(b.multiply(c)).divide(BigDecimal.valueOf(2), 2, RoundingMode.HALF_UP).abs());
		}
	}
}

package abc.abc186;

import org.junit.jupiter.api.Test;

import testbase.TestBase;

class ProblemETest extends TestBase {

	@Test
	void case1() {
		check("4\n" + "10 4 3\n" + "1000 11 2\n" + "998244353 897581057 595591169\n" + "10000 6 14",
				"2" + LF + "-1" + LF + "249561088" + LF + "3571");
	}
}
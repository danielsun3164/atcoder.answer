package abc.abc151_200.abc176;

import org.junit.jupiter.api.Test;

import testbase.TestBase;

class ProblemATest extends TestBase {

	@Test
	void case1() {
		check("20 12 6", "12");
	}

	@Test
	void case2() {
		check("1000 1 1000", "1000000");
	}
}

package abc.abc001_050.abc006;

import org.junit.jupiter.api.Test;

import testbase.TestBase;

class ProblemBTest extends TestBase {

	@Test
	void case1() {
		check("7", "7");
	}

	@Test
	void case2() {
		check("1", "0");
	}

	@Test
	void case3() {
		check("100000", "7927");
	}
}

package abc.abc051_100.abc100;

import org.junit.jupiter.api.Test;

import testbase.TestBase;

class ProblemATest extends TestBase {

	@Test
	void case1() {
		check("5 4", "Yay!");
	}

	@Test
	void case2() {
		check("8 8", "Yay!");
	}

	@Test
	void case3() {
		check("11 4", ":(");
	}
}

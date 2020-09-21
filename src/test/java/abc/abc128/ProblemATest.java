package abc.abc128;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemATest extends TestBase {

	@Test
	void case1() {
		check("1 3", "3");
	}

	@Test
	void case2() {
		check("0 1", "0");
	}

	@Test
	void case3() {
		check("32 21", "58");
	}
}
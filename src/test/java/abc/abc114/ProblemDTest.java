package abc.abc114;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemDTest extends TestBase {

	@Test
	void case1() {
		check("9", "0");
	}

	@Test
	void case2() {
		check("10", "1");
	}

	@Test
	void case3() {
		check("100", "543");
	}
}

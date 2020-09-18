package abc.abc120;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemATest extends TestBase {

	@Test
	void case1() {
		check("2 11 4", "4");
	}

	@Test
	void case2() {
		check("3 9 5", "3");
	}

	@Test
	void case3() {
		check("100 1 10", "0");
	}
}
package abc057;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemCTest extends TestBase {

	@Test
	void case1() {
		check("10000", "3");
	}

	@Test
	void case2() {
		check("1000003", "7");
	}

	@Test
	void case3() {
		check("9876543210", "6");
	}

	@Test
	void case4() {
		check("100000007", "9");
	}
}

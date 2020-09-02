package abc.abc068;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemATest extends TestBase {

	@Test
	void case1() {
		check("100", "ABC100");
	}

	@Test
	void case2() {
		check("425", "ABC425");
	}

	@Test
	void case3() {
		check("999", "ABC999");
	}
}
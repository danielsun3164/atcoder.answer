package abc.abc101_150.abc101;

import org.junit.jupiter.api.Test;

import testbase.TestBase;

class ProblemBTest extends TestBase {

	@Test
	void case1() {
		check("12", "Yes");
	}

	@Test
	void case2() {
		check("101", "No");
	}

	@Test
	void case3() {
		check("999999999", "Yes");
	}
}

package abc.abc080;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemBTest extends TestBase {

	@Test
	void case1() {
		check("12", "Yes");
	}

	@Test
	void case2() {
		check("57", "No");
	}

	@Test
	void case3() {
		check("148", "No");
	}
}
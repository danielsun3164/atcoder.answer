package abc.abc051_100.abc099;

import org.junit.jupiter.api.Test;

import testbase.TestBase;

class ProblemATest extends TestBase {

	@Test
	void case1() {
		check("999", "ABC");
	}

	@Test
	void case2() {
		check("1000", "ABD");
	}

	@Test
	void case3() {
		check("1481", "ABD");
	}
}

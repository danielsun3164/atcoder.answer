package abc.abc051_100.abc071;

import org.junit.jupiter.api.Test;

import testbase.TestBase;

class ProblemATest extends TestBase {

	@Test
	void case1() {
		check("5 2 7", "B");
	}

	@Test
	void case2() {
		check("1 999 1000", "A");
	}
}

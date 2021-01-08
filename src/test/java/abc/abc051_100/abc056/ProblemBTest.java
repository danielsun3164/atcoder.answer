package abc.abc051_100.abc056;

import org.junit.jupiter.api.Test;

import testbase.TestBase;

class ProblemBTest extends TestBase {

	@Test
	void case1() {
		check("3 2 6", "1");
	}

	@Test
	void case2() {
		check("3 1 3", "0");
	}

	@Test
	void case3() {
		check("5 10 1", "4");
	}
}

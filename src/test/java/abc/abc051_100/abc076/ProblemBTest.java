package abc.abc051_100.abc076;

import org.junit.jupiter.api.Test;

import testbase.TestBase;

class ProblemBTest extends TestBase {

	@Test
	void case1() {
		check("4\n" + "3", "10");
	}

	@Test
	void case2() {
		check("10\n" + "10", "76");
	}
}

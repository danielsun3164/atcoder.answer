package abc.abc051_100.abc054;

import org.junit.jupiter.api.Test;

import testbase.TestBase;

class ProblemATest extends TestBase {

	@Test
	void case1() {
		check("8 6", "Alice");
	}

	@Test
	void case2() {
		check("1 1", "Draw");
	}

	@Test
	void case3() {
		check("13 1", "Bob");
	}
}

package abc.abc051_100.abc063;

import org.junit.jupiter.api.Test;

import testbase.TestBase;

class ProblemCTest extends TestBase {

	@Test
	void case1() {
		check("3\n" + "5\n" + "10\n" + "15", "25");
	}

	@Test
	void case2() {
		check("3\n" + "10\n" + "10\n" + "15", "35");
	}

	@Test
	void case3() {
		check("3\n" + "10\n" + "20\n" + "30", "0");
	}
}

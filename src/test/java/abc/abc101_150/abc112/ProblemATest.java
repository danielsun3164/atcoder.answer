package abc.abc101_150.abc112;

import org.junit.jupiter.api.Test;

import testbase.TestBase;

class ProblemATest extends TestBase {

	@Test
	void case1() {
		check("1", "Hello World");
	}

	@Test
	void case2() {
		check("2\n" + "3\n" + "5", "8");
	}
}

package abc.abc001_050.abc004;

import org.junit.jupiter.api.Test;

import testbase.TestBase;

class ProblemCTest extends TestBase {

	@Test
	void case1() {
		check("1", "213456");
	}

	@Test
	void case2() {
		check("5", "234561");
	}

	@Test
	void case3() {
		check("22", "615234");
	}

	@Test
	void case4() {
		check("100000000", "345612");
	}
}

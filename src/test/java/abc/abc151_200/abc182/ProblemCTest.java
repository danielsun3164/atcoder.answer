package abc.abc151_200.abc182;

import org.junit.jupiter.api.Test;

import testbase.TestBase;

class ProblemCTest extends TestBase {

	@Test
	void case1() {
		check("35", "1");
	}

	@Test
	void case2() {
		check("369", "0");
	}

	@Test
	void case3() {
		check("6227384", "1");
	}

	@Test
	void case4() {
		check("11", "-1");
	}
}

package abc.abc001_050.abc034;

import org.junit.jupiter.api.Test;

import testbase.TestBase;

class ProblemATest extends TestBase {

	@Test
	void case1() {
		check("12 34", "Better");
	}

	@Test
	void case2() {
		check("98 56", "Worse");
	}
}

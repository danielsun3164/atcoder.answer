package abc.abc001_050.abc004;

import org.junit.jupiter.api.Test;

import testbase.TestBase;

class ProblemDTest extends TestBase {

	@Test
	void case1() {
		check("2 3 4", "7");
	}

	@Test
	void case2() {
		check("17 2 34", "362");
	}

	@Test
	void case3() {
		check("267 294 165", "88577");
	}
}

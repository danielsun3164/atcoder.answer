package abc.abc001_050.abc020;

import org.junit.jupiter.api.Test;

import testbase.TestBase;

class ProblemBTest extends TestBase {

	@Test
	void case1() {
		check("1 23", "246");
	}

	@Test
	void case2() {
		check("999 999", "1999998");
	}
}

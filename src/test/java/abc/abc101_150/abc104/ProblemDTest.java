package abc.abc101_150.abc104;

import org.junit.jupiter.api.Test;

import testbase.TestBase;

class ProblemDTest extends TestBase {

	@Test
	void case1() {
		check("A??C", "8");

	}

	@Test
	void case2() {
		check("ABCBC", "3");
	}

	@Test
	void case3() {
		check("????C?????B??????A???????", "979596887");
	}
}

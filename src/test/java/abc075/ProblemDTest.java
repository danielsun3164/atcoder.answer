package abc075;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemDTest extends TestBase {

	@Test
	void case1() {
		in.input("4 4\n" + "1 4\n" + "3 3\n" + "6 2\n" + "8 1");
		ProblemD.main(null);
		assertResultIs("21");
	}

	@Test
	void case2() {
		in.input("4 2\n" + "0 0\n" + "1 1\n" + "2 2\n" + "3 3");
		ProblemD.main(null);
		assertResultIs("1");
	}

	@Test
	void case3() {
		in.input("4 3\n" + "-1000000000 -1000000000\n" + "1000000000 1000000000\n" + "-999999999 999999999\n"
				+ "999999999 -999999999");
		ProblemD.main(null);
		assertResultIs("3999999996000000001");
	}
}

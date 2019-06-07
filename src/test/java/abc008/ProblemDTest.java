package abc008;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemDTest extends TestBase {

	@Test
	void test_Case1() {
		in.input("6 4\n" + "3\n" + "2 4\n" + "3 1\n" + "4 3");
		ProblemD.main(null);
		assertResultIs("19");
	}

	@Test
	void test_Case2() {
		in.input("3 3\n" + "3\n" + "1 1\n" + "2 3\n" + "3 2");
		ProblemD.main(null);
		assertResultIs("9");
	}

	@Test
	void test_Case3() {
		in.input("15 10\n" + "8\n" + "7 10\n" + "12 8\n" + "4 4\n" + "5 7\n" + "9 9\n" + "1 6\n" + "6 5\n" + "3 2");
		ProblemD.main(null);
		assertResultIs("112");
	}
}
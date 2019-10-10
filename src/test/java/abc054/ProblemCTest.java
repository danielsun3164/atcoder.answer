package abc054;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemCTest extends TestBase {

	@Test
	void test_Case1() {
		in.input("3 3\n" + "1 2\n" + "1 3\n" + "2 3");
		ProblemC.main(null);
		assertResultIs("2");
	}

	@Test
	void test_Case2() {
		in.input("7 7\n" + "1 3\n" + "2 7\n" + "3 4\n" + "4 5\n" + "4 6\n" + "5 6\n" + "6 7");
		ProblemC.main(null);
		assertResultIs("1");
	}
}
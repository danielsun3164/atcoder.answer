package abc015;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemCTest extends TestBase {

	@Test
	void test_Case1() {
		in.input("3 4\n" + "1 3 5 17\n" + "2 4 2 3\n" + "1 3 2 9");
		ProblemC.main(null);
		assertResultIs("Found");
	}

	@Test
	void test_Case2() {
		in.input("5 3\n" + "89 62 15\n" + "44 36 17\n" + "4 24 24\n" + "25 98 99\n" + "66 33 57");
		ProblemC.main(null);
		assertResultIs("Nothing");
	}
}
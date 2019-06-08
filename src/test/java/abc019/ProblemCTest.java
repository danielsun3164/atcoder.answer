package abc019;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemCTest extends TestBase {

	@Test
	void test_Case1() {
		in.input("3\n" + "1 2 3");
		ProblemC.main(null);
		assertResultIs("2");
	}

	@Test
	void test_Case2() {
		in.input("4\n" + "2 4 8 16");
		ProblemC.main(null);
		assertResultIs("1");
	}

	@Test
	void test_Case3() {
		in.input("4\n" + "2 3 5 7");
		ProblemC.main(null);
		assertResultIs("4");
	}
}
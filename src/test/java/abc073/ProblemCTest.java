package abc073;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemCTest extends TestBase {

	@Test
	void case1() {
		in.input("3\n" + "6\n" + "2\n" + "6");
		ProblemC.main(null);
		assertResultIs("1");
	}

	@Test
	void case2() {
		in.input("4\n" + "2\n" + "5\n" + "5\n" + "2");
		ProblemC.main(null);
		assertResultIs("0");
	}

	@Test
	void case3() {
		in.input("6\n" + "12\n" + "22\n" + "16\n" + "22\n" + "18\n" + "12");
		ProblemC.main(null);
		assertResultIs("2");
	}
}
package abc075;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemCTest extends TestBase {

	@Test
	void case1() {
		in.input("7 7\n" + "1 3\n" + "2 7\n" + "3 4\n" + "4 5\n" + "4 6\n" + "5 6\n" + "6 7");
		ProblemC.main(null);
		assertResultIs("4");
	}

	@Test
	void case2() {
		in.input("3 3\n" + "1 2\n" + "1 3\n" + "2 3");
		ProblemC.main(null);
		assertResultIs("0");
	}

	@Test
	void case3() {
		in.input("6 5\n" + "1 2\n" + "2 3\n" + "3 4\n" + "4 5\n" + "5 6");
		ProblemC.main(null);
		assertResultIs("5");
	}
}

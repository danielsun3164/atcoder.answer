package abc087;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemDTest extends TestBase {

	@Test
	void case1() {
		in.input("3 3\n" + "1 2 1\n" + "2 3 1\n" + "1 3 2");
		ProblemD.main(null);
		assertResultIs("Yes");
	}

	@Test
	void case2() {
		in.input("3 3\n" + "1 2 1\n" + "2 3 1\n" + "1 3 5");
		ProblemD.main(null);
		assertResultIs("No");
	}

	@Test
	void case3() {
		in.input("4 3\n" + "2 1 1\n" + "2 3 5\n" + "3 4 2");
		ProblemD.main(null);
		assertResultIs("Yes");
	}

	@Test
	void case4() {
		in.input("10 3\n" + "8 7 100\n" + "7 9 100\n" + "9 8 100");
		ProblemD.main(null);
		assertResultIs("No");
	}

	@Test
	void case5() {
		in.input("100 0");
		ProblemD.main(null);
		assertResultIs("Yes");
	}
}

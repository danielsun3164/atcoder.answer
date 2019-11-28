package abc063;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemCTest extends TestBase {

	@Test
	void case1() {
		in.input("3\n" + "5\n" + "10\n" + "15");
		ProblemC.main(null);
		assertResultIs("25");
	}

	@Test
	void case2() {
		in.input("3\n" + "10\n" + "10\n" + "15");
		ProblemC.main(null);
		assertResultIs("35");
	}

	@Test
	void case3() {
		in.input("3\n" + "10\n" + "20\n" + "30");
		ProblemC.main(null);
		assertResultIs("0");
	}
}
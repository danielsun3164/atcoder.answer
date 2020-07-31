package abc170;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemBTest extends TestBase {

	@Test
	void case1() {
		in.input("3 8");
		ProblemB.main(null);
		assertResultIs("Yes");
	}

	@Test
	void case2() {
		in.input("2 100");
		ProblemB.main(null);
		assertResultIs("No");
	}

	@Test
	void case3() {
		in.input("1 2");
		ProblemB.main(null);
		assertResultIs("Yes");
	}
}
package abc009;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemATest extends TestBase {

	@Test
	void test_Case1() {
		in.input("2");
		ProblemA.main(null);
		assertResultIs("1");
	}

	@Test
	void test_Case2() {
		in.input("5");
		ProblemA.main(null);
		assertResultIs("3");
	}

	@Test
	void test_Case3() {
		in.input("1");
		ProblemA.main(null);
		assertResultIs("1");
	}
}
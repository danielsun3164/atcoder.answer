package abc011;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemCTest extends TestBase {

	@Test
	void test_Case1() {
		in.input("2\n" + "1\n" + "7\n" + "15");
		ProblemC.main(null);
		assertResultIs("YES");
	}

	@Test
	void test_Case2() {
		in.input("5\n" + "1\n" + "4\n" + "2");
		ProblemC.main(null);
		assertResultIs("YES");
	}

	@Test
	void test_Case3() {
		in.input("300\n" + "57\n" + "121\n" + "244");
		ProblemC.main(null);
		assertResultIs("NO");
	}
}
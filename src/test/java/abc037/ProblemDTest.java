package abc037;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemDTest extends TestBase {

	@Test
	void test_Case1() throws IOException {
		in.input("2 3\n" + "1 4 5\n" + "2 4 9");
		ProblemD.main(null);
		assertResultIs("18");
	}

	@Test
	void test_Case2() throws IOException {
		in.input("6 6\n" + "1 3 4 6 7 5\n" + "1 2 4 8 8 7\n" + "2 7 9 2 7 2\n" + "9 4 2 7 6 5\n" + "2 8 4 6 7 6\n"
				+ "3 7 9 1 2 7");
		ProblemD.main(null);
		assertResultIs("170");
	}
}
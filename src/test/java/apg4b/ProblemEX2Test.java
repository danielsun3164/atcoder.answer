package apg4b;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemEX2Test extends TestBase {

	@Test
	void test_Case1() {
		ProblemEX2.main(null);
		assertResultIs("いつも2525" + LF + "AtCoderくん");
	}
}
package abc.abc179;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemATest extends TestBase {

	@Test
	void case1() {
		check("apple", "apples");
	}

	@Test
	void case2() {
		check("bus", "buses");
	}

	@Test
	void case3() {
		check("box", "boxs");
	}
}
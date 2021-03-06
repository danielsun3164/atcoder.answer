package abc.abc001_050.abc039;

import org.junit.jupiter.api.Test;

import testbase.TestBase;

class ProblemDTest extends TestBase {

	@Test
	void case1() {
		check("4 4\n" + "##..\n" + "##..\n" + "..##\n" + "..##",
				"possible" + LF + "#..." + LF + "...." + LF + "...." + LF + "...#");
	}

	@Test
	void case2() {
		check("4 4\n" + "###.\n" + "####\n" + "..##\n" + "..##",
				"possible" + LF + "##.." + LF + "...." + LF + "...#" + LF + "...#");
	}

	@Test
	void case3() {
		check("4 4\n" + "###.\n" + "##.#\n" + "..##\n" + "..##", "impossible");
	}
}

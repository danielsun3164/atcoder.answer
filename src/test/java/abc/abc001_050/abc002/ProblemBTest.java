package abc.abc001_050.abc002;

import org.junit.jupiter.api.Test;

import testbase.TestBase;

class ProblemBTest extends TestBase {

	@Test
	void case1() {
		check("chokudai", "chkd");
	}

	@Test
	void case2() {
		check("okanemochi", "knmch");
	}

	@Test
	void case3() {
		check("aoki", "k");
	}

	@Test
	void case4() {
		check("mazushii", "mzsh");
	}
}

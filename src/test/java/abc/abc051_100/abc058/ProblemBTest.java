package abc.abc051_100.abc058;

import org.junit.jupiter.api.Test;

import testbase.TestBase;

class ProblemBTest extends TestBase {

	@Test
	void case1() {
		check("xyz\n" + "abc", "xaybzc");
	}

	@Test
	void case2() {
		check("atcoderbeginnercontest\n" + "atcoderregularcontest", "aattccooddeerrbreeggiunlnaerrccoonntteesstt");
	}
}

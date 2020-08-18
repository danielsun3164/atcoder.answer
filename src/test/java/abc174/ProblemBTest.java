package abc174;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemBTest extends TestBase {

	@Test
	void case1() {
		in.input("4 5\n" + "0 5\n" + "-2 4\n" + "3 4\n" + "4 -4");
		ProblemB.main(null);
		assertResultIs("3");
	}

	@Test
	void case2() {
		in.input("12 3\n" + "1 1\n" + "1 1\n" + "1 1\n" + "1 1\n" + "1 2\n" + "1 3\n" + "2 1\n" + "2 2\n" + "2 3\n"
				+ "3 1\n" + "3 2\n" + "3 3");
		ProblemB.main(null);
		assertResultIs("7");
	}

	@Test
	void case3() {
		in.input("20 100000\n" + "14309 -32939\n" + "-56855 100340\n" + "151364 25430\n" + "103789 -113141\n"
				+ "147404 -136977\n" + "-37006 -30929\n" + "188810 -49557\n" + "13419 70401\n" + "-88280 165170\n"
				+ "-196399 137941\n" + "-176527 -61904\n" + "46659 115261\n" + "-153551 114185\n" + "98784 -6820\n"
				+ "94111 -86268\n" + "-30401 61477\n" + "-55056 7872\n" + "5901 -163796\n" + "138819 -185986\n"
				+ "-69848 -96669");
		ProblemB.main(null);
		assertResultIs("6");
	}
}

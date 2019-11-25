package abc009;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemDTest extends TestBase {

	@Test
	void case1() {
		in.input("3 5\n" + "10 20 30\n" + "7 19 13");
		ProblemD.main(null);
		assertResultIs("16");
	}

	@Test
	void case2() {
		in.input("5 100\n" + "2345678901 1001001001 3333333333 3141592653 1234567890\n"
				+ "2147483648 2147483647 4294967295 4294967294 3434343434");
		ProblemD.main(null);
		assertResultIs("1067078691");
	}

	@Test
	void case3() {
		in.input("30 999999999\n"
				+ "11627 5078 8394 6412 10346 3086 3933 668 9879 11739 4501 6108 12336 8771 2768 2438 2153 7047 5476 313 1264 369 12070 10743 10663 747 370 4671 5235 3439\n"
				+ "114 3613 3271 5032 11241 6961 3628 150 12191 2396 7638 3046 11594 8162 11136 786 9878 2356 11660 1070 3649 10882 9746 1415 3307 7077 9319 9981 3437 544");
		ProblemD.main(null);
		assertResultIs("2148");
	}
}

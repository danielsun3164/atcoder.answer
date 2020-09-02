package abc.abc088;

import org.junit.jupiter.api.Test;

import practice.TestBase;

class ProblemDTest extends TestBase {

	@Test
	void case1() {
		check("3 3\n" + "..#\n" + "#..\n" + "...", "2");
	}

	@Test
	void case2() {
		check("10 37\n" + ".....................................\n" + "...#...####...####..###...###...###..\n"
				+ "..#.#..#...#.##....#...#.#...#.#...#.\n" + "..#.#..#...#.#.....#...#.#...#.#...#.\n"
				+ ".#...#.#..##.#.....#...#.#.###.#.###.\n" + ".#####.####..#.....#...#..##....##...\n"
				+ ".#...#.#...#.#.....#...#.#...#.#...#.\n" + ".#...#.#...#.##....#...#.#...#.#...#.\n"
				+ ".#...#.####...####..###...###...###..\n" + ".....................................", "209");
	}
}
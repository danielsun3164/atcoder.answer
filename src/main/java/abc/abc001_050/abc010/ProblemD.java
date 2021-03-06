package abc.abc001_050.abc010;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * https://atcoder.jp/contests/abc010/submissions/3043476 を元に作成
 */
public class ProblemD {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), g = scanner.nextInt(), e = scanner.nextInt();
			int[][] graph = new int[n + 1][n + 1];
			IntStream.range(0, g).forEach(i -> graph[scanner.nextInt()][n] = 1);
			IntStream.range(0, e).forEach(i -> {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				graph[a][b] = graph[b][a] = 1;
			});
			int answer = 0;
			int[] path;
			while ((path = dfs(graph, 0, n, 0, new boolean[n + 1])) != null) {
				answer++;
				for (int i = 1; i < path.length; i++) {
					graph[path[i - 1]][path[i]]--;
					graph[path[i]][path[i - 1]]++;
				}
			}
			System.out.println(answer);
		}
	}

	/**
	 * 開始ノードから目的ノードまでのパスの配列を計算する
	 * 
	 * @param graph    グラフを表す配列
	 * @param start    開始ノード
	 * @param goal     目的ノード
	 * @param depth    処理したノードの数
	 * @param searched 各ノードが処理したかどうかを保存する配列
	 * @return 開始ノードから目的ノードまでのパスの配列
	 */
	private static int[] dfs(int[][] graph, final int start, final int goal, final int depth, boolean[] searched) {
		if (start == goal) {
			int[] res = new int[depth + 1];
			res[depth] = goal;
			return res;
		}
		searched[start] = true;
		for (int i = 0; i < graph.length; i++) {
			if (!searched[i] && graph[start][i] > 0) {
				int[] res = dfs(graph, i, goal, depth + 1, searched);
				if (res != null) {
					res[depth] = start;
					return res;
				}
			}
		}
		return null;
	}
}

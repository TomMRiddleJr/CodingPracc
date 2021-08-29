package dp;

import java.util.*;
import imports.*;

public class EqualAveragePartition {
	static Integer[] numbers;
	static ArrayList[][][] dp;
	static boolean[][][] visited;
	static int N;
	static ArrayList<Integer> result;

	public static ArrayList<ArrayList<Integer>> avgset(List<Integer> A) {
		int total = 0;
		for (int number : A) {
			total += number;
		}

		N = A.size();
		numbers = (Integer[]) A.toArray(new Integer[A.size()]);
		Arrays.sort(numbers);

		for (int i = 1; i <= N / 2; i++) {
			if (i * total % N == 0) {
				int target = i * total / N;
				dp = new ArrayList[N][i + 1][target + 1];
				visited = new boolean[N][i + 1][target + 1];
				ArrayList<Integer> solution = (ArrayList<Integer>) solve(0, i, target);

				if (solution != null) {
					int j = solution.size() - 1;
					ArrayList<Integer> first = new ArrayList<Integer>();
					ArrayList<Integer> second = new ArrayList<Integer>();

					for (int k = 0; k < N; k++) {
						if (j >= 0 && k == solution.get(j)) {
							first.add(numbers[k]);
							j--;
						} else {
							second.add(numbers[k]);
						}
					}

					ArrayList<ArrayList<Integer>> result = new ArrayList<>();
					result.add(first);
					result.add(second);

					return result;
				}
			}

		}

		return new ArrayList<ArrayList<Integer>>();
	}

	static ArrayList solve(int n, int limit, int left) {

		if (left < 0 || limit < 0) {
			return null;
		}

		if (left == 0) {
			ArrayList<Integer> result = new ArrayList<>();
			return result;
		}

		if (n >= N) {
			return null;
		}

		if (!visited[n][limit][left]) {
			visited[n][limit][left] = true;

			ArrayList<Integer> taken = (ArrayList<Integer>) solve(n + 1, limit - 1, left - numbers[n]);
			if (taken != null) {
				taken.add(n);
				dp[n][limit][left] = taken;
			} else {
				ArrayList<Integer> notTaken = (ArrayList<Integer>) solve(n + 1, limit, left);
				if (notTaken != null) {
					dp[n][limit][left] = notTaken;
				} else {
					dp[n][limit][left] = null;
				}
			}
		}

		return dp[n][limit][left];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(avgset(TakeMultiple.Int.intList(" ")));
	}

}

package dp;

import imports.*;

public class EggDropProblem {
	static int[][] t;

	static int helper(int e, int f) {
		if (f == 1 || f == 0 || e == 1)
			return f;
		if (e == 0)
			return Integer.MAX_VALUE;

		if (t[e][f] != -1)
			return t[e][f];

		int ans = Integer.MAX_VALUE;

		for (int k = 2; k < f + 1; k++) {
			int x = t[e - 1][k - 1] == -1 ? helper(e - 1, k - 1) : t[e - 1][k - 1];
			int y = t[e][f - k] == -1 ? helper(e, f - k) : t[e][f - k];

			int temp = 1 + Math.max(x, y);
			ans = Math.min(ans, temp);
		}

		t[e][f] = ans;

		return t[e][f];
	}

	static int binaryCount(int z) {
		int count = 0;
		while (z != 1) {
			z /= 2;
			count++;
		}

		return ++count;
	}

	public static int solve(int A, int B) {
		int fill = binaryCount(B);
		if (fill < A)
			return fill;
		t = new int[101][10001];
		for (int i = 0; i < t.length; i++)
			for (int j = 0; j < t[i].length; j++)
				t[i][j] = -1;
		return helper(A, B);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solve(TakeSingle.oneInt(), TakeSingle.oneInt()));

	}

}

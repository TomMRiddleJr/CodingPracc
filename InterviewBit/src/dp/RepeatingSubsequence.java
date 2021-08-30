package dp;

import imports.*;

public class RepeatingSubsequence {

	private static int LCSWithoutSamePosition(String A, String B) {
		int[][] t = new int[A.length() + 1][B.length() + 1];

		for (int i = 0; i < A.length() + 1; i++)
			for (int j = 0; j < B.length() + 1; j++)
				if (i == 0 || j == 0)
					t[i][j] = 0;
				else if (A.charAt(i - 1) == B.charAt(j - 1) && i != j)
					t[i][j] = 1 + t[i - 1][j - 1];
				else
					t[i][j] = Math.max(t[i][j - 1], t[i - 1][j]);

		return t[A.length()][B.length()];
	}

	public static int anytwo(String A) {
		int ans = LCSWithoutSamePosition(A, A);
		return ans > 1 ? 1 : 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(anytwo(TakeSingle.oneString()));

	}

}

package dp;

public class MaximumSizeSquareSubMatrix {

	public int solve(int[][] A) {
		int m = A.length;
		int n = A[0].length;
		int[][] t = new int[m][n];

		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				if (i == 0 || j == 0)
					t[i][j] = A[i][j];
				else if (A[i][j - 1] == 1 && A[i - 1][j] == 1 && A[i - 1][j - 1] == 1 && A[i][j] == 1)
					if (t[i - 1][j - 1] == t[i - 1][j] && t[i - 1][j] == t[i][j - 1])
						t[i][j] = t[i - 1][j - 1] + 1;
					else
						t[i][j] = Math.min(t[i - 1][j - 1], Math.min(t[i - 1][j], t[i][j - 1])) + 1;
				else
					t[i][j] = A[i][j];

		int ans = 0;

		for (int[] g : t)
			for (int gg : g)
				ans = Math.max(ans, gg);

		return ans * ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

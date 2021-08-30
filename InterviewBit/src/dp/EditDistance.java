package dp;

import imports.*;

public class EditDistance {

	public static int minDistance(String A, String B) {
		int[][] t = new int[A.length() + 1][B.length() + 1];

		for (int i = 0; i < A.length() + 1; i++)
			for (int j = 0; j < B.length() + 1; j++)
				if (i == 0)
					t[i][j] = j; // Add all the chars
				else if (j == 0)
					t[i][j] = i; // Delete all the chars
				else if (A.charAt(i - 1) == B.charAt(j - 1))
					t[i][j] = t[i - 1][j - 1]; // Do not do anything
				else
					t[i][j] = 1 + Math.min(t[i][j - 1], // Minimum of deletion,
							Math.min(t[i - 1][j], // Addition
									t[i - 1][j - 1])); // Replacement

		return t[A.length()][B.length()];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(minDistance(TakeSingle.oneString(), TakeSingle.oneString()));

	}

}

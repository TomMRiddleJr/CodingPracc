package dp;

import imports.*;

public class MaxSumWithoutAdjacentElements {

	public static int adjacent(int[][] A) {
		int t[][] = new int[2][A[0].length];

		for (int j = 0; j < A[0].length; j++)
			for (int i = 0; i < 2; i++)
				if (i == 0 && j == 0)
					t[i][j] = A[0][0];
				else if (i == 0 && j == 1)
					t[i][j] = Math.max(A[0][1], A[0][0]);
				else if (i == 1 && j == 0)
					t[i][j] = Math.max(A[0][0], A[1][0]);
				else if (i == 1 && j == 1)
					t[i][j] = Math.max(A[1][1], Math.max(t[0][1], t[1][0]));
				else if (i == 0)
					t[i][j] = Math.max(A[i][j] + Math.max(t[0][j - 2], t[1][j - 2]),
							Math.max(t[0][j - 1], t[1][j - 1]));
				else
					t[i][j] = Math.max(A[i][j] + Math.max(t[0][j - 2], t[1][j - 2]),
							Math.max(t[0][j - 1], t[1][j - 1]));

		return Math.max(t[1][A[0].length - 1], t[0][A[0].length - 1]);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] one = TakeMultiple.Int.intArray(", ");
		int[] two = TakeMultiple.Int.intArray(", ");

		int[][] ques = new int[2][one.length];
		ques[0] = one;
		ques[1] = two;

		System.out.println(adjacent(ques));

	}

}

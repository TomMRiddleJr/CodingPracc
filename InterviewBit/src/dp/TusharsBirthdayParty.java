package dp;

import java.util.*;
import imports.*;

public class TusharsBirthdayParty {

	static int[][] knap(List<Integer> A, List<Integer> B, int C) {
		int[][] t = new int[A.size() + 1][C + 1];

		for (int i = 0; i < A.size() + 1; i++)
			for (int j = 0; j < C + 1; j++)
				if (i == 0 && j == 0)
					t[i][j] = 0;
				else if (i == 0)
					t[i][j] = Integer.MAX_VALUE - 1001;
				else if (j == 0)
					t[i][j] = 0;
				else if (B.get(i - 1) <= j)
					t[i][j] = Math.min(t[i - 1][j], A.get(i - 1) + t[i][j - B.get(i - 1)]);
				else
					t[i][j] = t[i - 1][j];

		return t;

	}

	public static int solve(final List<Integer> A, final List<Integer> B, final List<Integer> C) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for (int a : A)
			max = Math.max(a, max);

		int t[][] = knap(C, B, max);

		for (int a : A)
			sum += t[B.size()][a];

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(
				solve(TakeMultiple.Int.intList(" "), TakeMultiple.Int.intList(" "), TakeMultiple.Int.intList(" ")));

	}

}

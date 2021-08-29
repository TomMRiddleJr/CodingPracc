package dp;

import java.util.*;
import imports.*;

public class Knapsack01 {

	public static int solve(List<Integer> A, List<Integer> B, int C) {
		int[][] t = new int[A.size() + 1][C + 1];

		for (int i = 0; i < A.size() + 1; i++)
			for (int j = 0; j < C + 1; j++)
				if (i == 0 || j == 0)
					t[i][j] = 0;
				else if (B.get(i - 1) <= j)
					t[i][j] = Math.max(t[i - 1][j], A.get(i - 1) + t[i - 1][j - B.get(i - 1)]);
				else
					t[i][j] = t[i - 1][j];

		return t[A.size()][C];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solve(TakeMultiple.Int.intList(" "), TakeMultiple.Int.intList(" "), TakeSingle.oneInt()));

	}

}

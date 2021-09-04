package dp;

import imports.*;
import java.util.*;

public class MaxRectangleInBinaryMatrix {

	public static int maximalRectangle(ArrayList<ArrayList<Integer>> A) {
		int[][] dp = new int[A.size()][A.get(0).size()];

		for (int i = 0; i < A.size(); i++) {
			for (int j = 0; j < A.get(i).size(); j++) {
				if (A.get(i).get(j) == 1) {
					if (j - 1 >= 0)
						dp[i][j] = dp[i][j - 1] + 1;
					else
						dp[i][j] = 1;
				}
			}
		}
		int maxArea = 0;
		for (int i = 0; i < A.size(); i++) {
			for (int j = 0; j < A.get(i).size(); j++) {
				if (dp[i][j] >= 1) {
					int minWidth = dp[i][j];
					maxArea = Math.max(maxArea, minWidth);
					for (int k = i - 1; k >= 0; k--) {
						if (dp[k][j] == 0)
							break;

						if (dp[k][j] < minWidth)
							minWidth = dp[k][j];

						maxArea = Math.max(maxArea, (i - k + 1) * minWidth);
					}
				}
			}
		}

		return maxArea;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = TakeSingle.oneInt();
		int m = TakeSingle.oneInt();
		ArrayList<ArrayList<Integer>> A = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> temp = new ArrayList<>();
			for (int j = 0; j < m; j++)
				temp.add(TakeSingle.oneInt());
			A.add(temp);
		}

		System.out.println(maximalRectangle(A));

	}

}

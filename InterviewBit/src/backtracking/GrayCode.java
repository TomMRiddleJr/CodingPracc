package backtracking;

import java.util.*;
import imports.*;

public class GrayCode {

	public static ArrayList<Integer> grayCode(int a) {
		int n = (int) Math.pow(2, a);
		String[][] arr = new String[a][n];

		arr[0][0] = "0";
		arr[0][1] = "1";

		for (int i = 1; i < a; i++) {
			int k = (int) Math.pow(2, i + 1);
			for (int j = 0; j < k; j++)
				if (j < k / 2)
					arr[i][j] = "0" + arr[i - 1][j];
				else
					arr[i][j] = "1" + arr[i - 1][k - j - 1];
		}

		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = 0; i < n; i++)
			ans.add(Integer.parseInt(arr[a - 1][i], 2));

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(grayCode(TakeSingle.oneInt()));
	}

}

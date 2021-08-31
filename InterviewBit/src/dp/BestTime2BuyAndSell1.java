package dp;

import imports.*;
import java.util.*;

public class BestTime2BuyAndSell1 {

	public static int maxProfit(final List<Integer> A) {
		if (A.size() == 0 || A.size() == 1)
			return 0;
		int ans = 0;
		int[] max = new int[A.size()];
		int[] min = new int[A.size()];

		min[0] = A.get(0);
		max[A.size() - 1] = A.get(A.size() - 1);

		for (int i = 1; i < A.size(); i++)
			min[i] = Math.min(min[i - 1], A.get(i));

		for (int j = A.size() - 2; j > -1; j--)
			max[j] = Math.max(max[j + 1], A.get(j));

		for (int k = 0; k < A.size() - 1; k++)
			ans = Math.max(ans, max[k + 1] - min[k]);

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(maxProfit(TakeMultiple.Int.intList(" ")));

	}

}

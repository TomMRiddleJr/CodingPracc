package stacksAndQueues;

import imports.*;
import java.util.*;

public class RainWaterTrapped {

	public static int trap(final List<Integer> A) {
		ArrayList<Integer> maxL = new ArrayList<Integer>();
		ArrayList<Integer> maxR = new ArrayList<Integer>();
		maxL.add(0);
		maxR.add(0);
		for (int i = 1; i < A.size(); i++)
			maxL.add(Math.max(maxL.get(i - 1), A.get(i - 1)));
		for (int j = A.size() - 2; j > -1; j--)
			maxR.add(Math.max(maxR.get(A.size() - j - 2), A.get(j + 1)));
		int ans = 0;
		Collections.reverse(maxR);

		for (int i = 0; i < A.size(); i++)
			ans += Math.min(maxL.get(i), maxR.get(i)) >= A.get(i) ? Math.min(maxL.get(i), maxR.get(i)) - A.get(i) : 0;

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(trap(TakeMultiple.Int.intList(" ")));

	}

}

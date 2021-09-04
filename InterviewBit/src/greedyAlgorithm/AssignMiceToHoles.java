package greedyAlgorithm;

import java.util.*;
import imports.*;

public class AssignMiceToHoles {

	public static int mice(List<Integer> A, List<Integer> B) {
		Collections.sort(A);
		Collections.sort(B);
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < A.size(); i++)
			ans = Math.max(ans, Math.abs(A.get(i) - B.get(i)));
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(mice(TakeMultiple.Int.intList(" "), TakeMultiple.Int.intList(" ")));

	}

}

package bitManipulation;

import java.util.*;
import imports.TakeMultiple;

public class MinXORValue {

	public static int findMinXor(ArrayList<Integer> A) {
		Collections.sort(A);
		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < A.size() - 1; i++) {
			ans = Math.min(ans, A.get(i) ^ A.get(i + 1));
		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findMinXor((ArrayList<Integer>) TakeMultiple.Int.intList(" ")));
	}

}

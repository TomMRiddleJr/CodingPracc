package twoPointers;

import java.util.*;
import imports.*;

public class SubarraysWithDistinctIntegers {

	public static int helper(ArrayList<Integer> A, int B) {
		if (B == 0)
			return 0;
		int i = 0, j = 0, ans = 0;
		Map<Integer, Integer> map = new HashMap<>();
		while (j < A.size()) {
			if (map.containsKey(A.get(j)))
				map.put(A.get(j), map.get(A.get(j)) + 1);
			else {
				while (map.size() > B - 1) {
					if (map.containsKey(A.get(i)))
						map.put(A.get(i), map.get(A.get(i)) - 1);
					if (map.get(A.get(i)) == 0)
						map.remove(A.get(i));
					i++;
				}

				map.put(A.get(j), 1);
			}

			if (map.size() <= B)
				ans = ans + j - i + 1;
			j++;
		}

		return ans;

	}

	public static int solve(ArrayList<Integer> A, int B) {
		return helper(A, B) - helper(A, B - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve((ArrayList<Integer>) TakeMultiple.Int.intList(" "), TakeSingle.oneInt()));

	}

}

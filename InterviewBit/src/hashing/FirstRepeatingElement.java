package hashing;

import java.util.*;
import imports.*;

public class FirstRepeatingElement {

	public static int solve(ArrayList<Integer> A) {
		Map<Integer, Integer> map = new HashMap<>();
		int idx = Integer.MAX_VALUE;
		
		for (int i = 0; i < A.size(); i++)
			if (!map.containsKey(A.get(i)))
				map.put(A.get(i), i);
			else
				idx = Math.min(idx, map.get(A.get(i)));

		return idx == Integer.MAX_VALUE ? -1 : A.get(idx);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve((ArrayList<Integer>) TakeMultiple.Int.intList(" ")));
	}

}

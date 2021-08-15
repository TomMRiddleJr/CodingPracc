package hashing;

import java.util.*;
import imports.*;

public class DiffkII {

	public static int diffPossible(final List<Integer> A, int B) {
		Set<Integer> set = new HashSet<>();
		for (int a : A)
			if (set.contains(a))
				return 1;
			else {
				set.add(a + B);
				set.add(a - B);
			}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(diffPossible(TakeMultiple.Int.intList(" "), TakeSingle.oneInt()));

	}

}

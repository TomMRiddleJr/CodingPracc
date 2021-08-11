package backtracking;

import java.util.*;
import imports.*;

public class Combinations {

	private static ArrayList<ArrayList<Integer>> ans;
	private static Set<ArrayList<Integer>> set;

	public static void helper(int A, int B, ArrayList<Integer> sol, int idx) {
		if (B == 0) {
			Collections.sort(sol);
			if (!set.contains(sol))
				ans.add(sol);
			set.add(sol);
			return;
		}

		for (int i = idx; i <= A; i++) {
			sol.add(i);
			helper(A, B - 1, new ArrayList<>(sol), i + 1);
			int g = sol.remove(sol.size() - 1);
		}
	}

	public static ArrayList<ArrayList<Integer>> combine(int A, int B) {
		ans = new ArrayList<>();
		set = new HashSet<>();
		helper(A, B, new ArrayList<>(), 1);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(combine(TakeSingle.oneInt(), TakeSingle.oneInt()));

	}

}

package tree;

import java.util.*;
import imports.*;

public class ReverseLevelOrder {

	static Map<Integer, ArrayList<Integer>> m;

	static void helper(TreeNode a, int level) {
		if (a == null)
			return;
		ArrayList<Integer> temp = new ArrayList<>();
		if (m.containsKey(level))
			temp = m.get(level);
		temp.add(a.val);
		m.put(level, temp);

		helper(a.left, level + 1);
		helper(a.right, level + 1);

	}

	public ArrayList<Integer> solve(TreeNode A) {
		ArrayList<Integer> ans = new ArrayList<>();
		m = new TreeMap<>();
		helper(A, 0);

		for (Map.Entry<Integer, ArrayList<Integer>> e : m.entrySet())
			ans.addAll(0, e.getValue());

		return ans;
	}
}

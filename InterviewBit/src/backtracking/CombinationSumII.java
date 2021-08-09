package backtracking;

import java.util.*;
import imports.*;

public class CombinationSumII {

	static ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
	static Set<String> set = new HashSet<String>();

	public static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
		Collections.sort(a);
		onSum(a, b, 0, new ArrayList());
		return ret;
	}

	private static void onSum(ArrayList<Integer> a, int b, int idx, ArrayList<Integer> tmp) {
		if (b == 0) {
			StringBuilder sb = new StringBuilder();
			for (Integer i : tmp)
				sb.append(i.toString());

			if (!set.contains(sb.toString())) {
				ret.add(tmp);
				set.add(sb.toString());
			}
			return;
		}

		if (b < 0)
			return;

		for (int i = idx; i < a.size(); i++) {
			// if ((i > 0 && a.get(i) != a.get(i-1)) || (i == 0)) {
			tmp.add(a.get(i));
			onSum(a, b - a.get(i), i + 1, new ArrayList(tmp));
			tmp.remove(tmp.size() - 1);
			// }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(combinationSum((ArrayList<Integer>) TakeMultiple.Int.intList(" "), TakeSingle.oneInt()));
	}

}

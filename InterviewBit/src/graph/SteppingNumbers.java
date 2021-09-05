package graph;

import java.util.*;
import imports.*;

public class SteppingNumbers {

	static ArrayList<Integer> ans;

	static void helper(Map<Integer, ArrayList<Integer>> m, int A, int B, String str, int start) {
		int num = Integer.parseInt(str);
		if (num >= A && num <= B) {
			if (!ans.contains(num))
				ans.add(num);
		} else if (num > B)
			return;

		ArrayList<Integer> temp = m.get(start);
		if (temp.size() == 1)
			helper(m, A, B, str + temp.get(0), temp.get(0));
		else {
			helper(m, A, B, str + temp.get(0), temp.get(0));
			helper(m, A, B, str + temp.get(1), temp.get(1));
		}

	}

	public static ArrayList<Integer> stepnum(int A, int B) {
		ans = new ArrayList<>();
		if (A < 10)
			for (int i = A; i < Math.min(10, B + 1); i++)
				ans.add(i);
		if (B < 10)
			return ans;
		Map<Integer, ArrayList<Integer>> map = new HashMap<>();

		for (int i = 0; i < 10; i++) {
			ArrayList<Integer> temp = new ArrayList<>();
			if (i == 0)
				temp.add(1);
			else if (i == 9)
				temp.add(8);
			else {
				temp.add(i + 1);
				temp.add(i - 1);
			}
			map.put(i, temp);
		}

		for (int i = 1; i < 10; i++) {
			helper(map, A, B, Integer.toString(i), i);
		}
		Collections.sort(ans);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(stepnum(TakeSingle.oneInt(), TakeSingle.oneInt()));

	}

}

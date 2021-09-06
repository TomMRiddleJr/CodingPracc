package graph;

import java.util.*;
import imports.*;

public class TwoTeams {

	public static int solve(int A, ArrayList<ArrayList<Integer>> B) {
		Map<Integer, ArrayList<Integer>> map = new HashMap<>();

		for (ArrayList<Integer> l : B) {
			ArrayList<Integer> temp = new ArrayList<>();
			if (map.containsKey(l.get(0)))
				temp = map.get(l.get(0));
			temp.add(l.get(1));
			map.put(l.get(0), temp);
		}

		Stack<Integer> s = new Stack<>();
		boolean[] t1 = new boolean[A + 1];
		boolean[] t2 = new boolean[A + 1];
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < Math.min(A, 100); i++)
			s.add(i);

		while (!s.empty()) {
			int x = s.pop();
			if (t1[x] && t2[x])
				return 0;
			else if (!t1[x] && !t2[x]) {
				if (map.containsKey(x)) {
					ArrayList<Integer> temp = map.get(x);
					for (int i : temp) {
						if (t1[i]) {
							t2[x] = true;
						} else if (t2[i]) {
							t1[x] = true;
						} else {
							t2[i] = true;
							t1[x] = true;
						}
						if (!set.contains(i))
							s.add(i);
						set.add(i);
					}
				}
			} else if (t1[x] && !t2[x]) {
				if (map.containsKey(x)) {
					ArrayList<Integer> temp = map.get(x);
					for (int i : temp) {
						t2[i] = true;
						if (!set.contains(i))
							s.add(i);
						set.add(i);
					}
				}
			} else {
				if (map.containsKey(x)) {
					ArrayList<Integer> temp = map.get(x);
					for (int i : temp) {
						t1[i] = true;
						if (!set.contains(i))
							s.add(i);
						set.add(i);
					}
				}
			}
		}

		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = TakeSingle.oneInt();
		int target = TakeSingle.oneInt();

		ArrayList<ArrayList<Integer>> B = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			ArrayList<Integer> temp = new ArrayList<>();
			temp.add(TakeSingle.oneInt());
			temp.add(TakeSingle.oneInt());
			B.add(temp);
		}

		System.out.println(solve(target, B));

	}

}

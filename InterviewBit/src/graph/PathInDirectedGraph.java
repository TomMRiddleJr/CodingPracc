package graph;

import java.util.*;
import imports.*;

public class PathInDirectedGraph {

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
		Set<Integer> v = new HashSet<>();
		s.add(1);

		while (!s.empty()) {
			int x = s.pop();
			if (!v.contains(x)) {
				v.add(x);
				if (map.containsKey(x)) {
					ArrayList<Integer> t = map.get(x);
					for (int i : t)
						if (i == A)
							return 1;
						else
							s.add(i);
				}
			}
		}

		return 0;
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

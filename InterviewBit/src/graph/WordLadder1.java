package graph;

import java.util.*;
import imports.*;

class Words {
	int cost;
	String str;

	public Words(int c, String s) {
		this.cost = c;
		this.str = s;
	}
}

public class WordLadder1 {

	static boolean compare(String a, String b) {
		boolean flag = false;
		for (int i = 0; i < a.length(); i++)
			if (a.charAt(i) != b.charAt(i))
				if (flag)
					return false;
				else
					flag = true;
		return true;
	}

	public static int solve(String A, String B, List<String> C) {
		Map<String, ArrayList<String>> map = new HashMap<>();
		C.add(0, A);
		C.add(B);
		for (int i = 0; i < C.size(); i++) {
			ArrayList<String> temp = new ArrayList<>();
			for (int j = 0; j < C.size(); j++)
				if (i != j && compare(C.get(i), C.get(j)))
					temp.add(C.get(j));
			map.put(C.get(i), temp);
		}

		Queue<Words> q = new PriorityQueue<>((a, b) -> a.cost - b.cost);
		Set<String> v = new HashSet<>();
		q.add(new Words(1, A));

		while (!q.isEmpty()) {
			Words w = q.poll();
			if (w.str.equals(B))
				return w.cost;
			if (!v.contains(w.str)) {
				String s = w.str;
				int c = w.cost;
				v.add(s);
				if (map.containsKey(s)) {
					ArrayList<String> temp = map.get(s);
					for (String str : temp)
						q.offer(new Words(c + 1, str));
				}
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solve(TakeSingle.oneString(), TakeSingle.oneString(), TakeMultiple.Strr.strList(" ")));

//		System.out.println(compare("dog", "cig"));
	}

}

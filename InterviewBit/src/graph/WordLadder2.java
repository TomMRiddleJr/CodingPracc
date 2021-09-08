package graph;

import java.util.*;
import imports.*;

public class WordLadder2 {

	static class Word {
		String str;
		ArrayList<String> path;

		public Word(String w, ArrayList<String> p) {
			this.str = w;
			this.path = p;
		}
	}

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

	public static ArrayList<ArrayList<String>> findLadders(String start, String end, List<String> dict) {

		ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();
		Queue<Word> queue = new PriorityQueue<>((a, b) -> a.path.size() - b.path.size());
		ArrayList<String> path = new ArrayList<String>();
		path.add(start);
		queue.add(new Word(start, path));
		Set<String> visited = new HashSet<>();
		dict.add(start);
		dict.add(end);
		visited.add(start);
		Set<ArrayList<String>> set = new HashSet<ArrayList<String>>();
		int maxLength = 0;
		while (!queue.isEmpty()) {
			Word w = queue.poll();
			visited.add(w.str);
			if (w.str.equals(end)) {
				if (!set.contains(w.path)) {
					ans.add(new ArrayList<String>(w.path));
					set.add(new ArrayList<String>(w.path));
				}
				maxLength = Math.max(maxLength, w.path.size());
			} else {
				for (String d : dict) {
					if (!visited.contains(d) && compare(d, w.str)) {
						path = new ArrayList<String>(w.path);
						path.add(d);
						queue.add(new Word(d, path));
					}
				}
			}
		}
		int i = 0;
		while (i < ans.size()) {
			if (ans.get(i).size() < maxLength)
				ans.remove(i);
			else
				i++;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findLadders(TakeSingle.oneString(), TakeSingle.oneString(), TakeMultiple.Strr.strList(" ")));

	}

}

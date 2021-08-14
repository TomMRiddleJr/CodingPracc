package hashing;

import java.util.*;
import imports.*;

public class Anagrams {

	static String sorting(String str) {
		ArrayList<Character> chars = new ArrayList<>();
		for (char c : str.toCharArray())
			chars.add(c);

		Collections.sort(chars);

		StringBuilder strr = new StringBuilder();
		for (char cc : chars)
			strr.append(cc);

		return strr.toString();
	}

	public static ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
		Map<String, ArrayList<Integer>> m = new HashMap<>();
		for (int i = 0; i < A.size(); i++) {
			ArrayList<Integer> idx = new ArrayList<>();
			String in = A.get(i);

			String temp = sorting(in);

			if (m.containsKey(temp))
				idx = m.get(temp);
			idx.add(i + 1);
			m.put(temp, idx);
		}

		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		for (ArrayList<Integer> arr : m.values())
			ans.add(arr);

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(anagrams(TakeMultiple.Strr.strList(" ")));

	}

}

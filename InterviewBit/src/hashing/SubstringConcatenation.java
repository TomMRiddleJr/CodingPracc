package hashing;

import java.util.*;
import imports.*;

public class SubstringConcatenation {

	public static ArrayList<Integer> findSubstring(String A, final List<String> B) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (B.size() == 0)
			return list;

		Map<String, Integer> dict = new HashMap<>();
		for (String s : B)
			dict.put(s, dict.getOrDefault(s, 0) + 1);
		int len = B.size() * (B.get(0).length());
		int wlen = B.get(0).length();

		for (int i = 0; i <= A.length() - len; i++) {
			String s = A.substring(i, i + len);
			Map<String, Integer> map = new HashMap<>();
			for (int j = 0; j < s.length(); j += wlen) {
				String temp = s.substring(j, j + wlen);
				map.put(temp, map.getOrDefault(temp, 0) + 1);
			}

			if (dict.equals(map))
				list.add(i);
		}

		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findSubstring(TakeSingle.oneString(), TakeMultiple.Strr.strList(" ")));

	}

}

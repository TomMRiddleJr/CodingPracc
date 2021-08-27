package tree;

import java.util.*;
import imports.*;

public class ShortestUniquePrefix {

	public static ArrayList<String> prefix(List<String> A) {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		ArrayList<String> list = new ArrayList<String>();

		for (String s : A)
			for (int i = 1; i <= s.length(); i++) {
				String pre = new String(s.substring(0, i));
				map.put(pre, map.getOrDefault(pre, 0) + 1);
			}

		for (String s : A)
			for (int i = 1; i <= s.length(); i++) {
				String pre = new String(s.substring(0, i));
				if (map.get(pre).equals(1)) {
					list.add(pre);
					break;
				}
			}

		return list;
	}

	public static void main(String[] args) {
		System.out.println(prefix(TakeMultiple.Strr.strList(" ")));
	}

}

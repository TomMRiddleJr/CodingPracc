package dp;

import java.util.*;
import imports.*;

public class WorkBreak2 {

	static HashMap<String, ArrayList<String>> map;

	static ArrayList<String> list(String A, List<String> B) {
		if (map.containsKey(A))
			return map.get(A);

		ArrayList<String> result = new ArrayList<String>();

		for (int i = 0; i < A.length(); i++) {
			String temp = A.substring(0, i + 1);
			if (B.indexOf(temp) != -1) {
				if (i < A.length() - 1)
					for (String h : list(A.substring(i + 1), B))
						result.add(temp + " " + h);
				else
					result.add(temp);
			}
		}

		map.put(A, result);
		return result;
	}

	public static ArrayList<String> wordBreak(String A, List<String> B) {
		map = new HashMap<String, ArrayList<String>>();
		return list(A, B);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(wordBreak(TakeSingle.oneString(), TakeMultiple.Strr.strList(" ")));

	}

}

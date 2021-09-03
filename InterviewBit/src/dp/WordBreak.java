package dp;

import java.util.*;
import imports.*;

public class WordBreak {

	static Map<String, Integer> map = new HashMap();

	public static int wordBreak(String A, List<String> B) {
		if (B.contains(A))
			return 1;
		if (map.containsKey(A))
			return map.get(A);

		for (int i = 1; i <= A.length(); i++) {
			String left = A.substring(0, i);

			if (B.contains(left) && wordBreak(A.substring(i), B) == 1) {
				map.put(A, 1);
				return 1;
			}
		}
		map.put(A, 0);
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(wordBreak(TakeSingle.oneString(), TakeMultiple.Strr.strList(" ")));

	}

}

package hashing;

import imports.*;
import java.util.*;

public class LongestSubstringWithoutRepeat {

	public static int lengthOfLongestSubstring(String A) {
		Map<Character, Integer> m = new HashMap<>();
		int i = 0, j = 0, ans = 0;

		while (j < A.length()) {
			m.put(A.charAt(j), m.getOrDefault(A.charAt(j), 0) + 1);

			while (m.size() < j - i + 1) {
				m.put(A.charAt(i), m.get(A.charAt(i)) - 1);
				if (m.get(A.charAt(i)) == 0)
					m.remove(A.charAt(i));
				i++;
			}

			if (m.size() == j - i + 1)
				ans = Math.max(ans, j - i + 1);
			j++;
		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(lengthOfLongestSubstring(TakeSingle.oneString()));

	}

}

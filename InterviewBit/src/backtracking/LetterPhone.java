package backtracking;

import java.util.*;
import imports.*;

public class LetterPhone {

	static void helper(String A, Map<Character, String> dict, ArrayList<String> ans, int idx, String str) {
		if (idx == A.length()) {
			ans.add(str);
			return;
		}

		char key = A.charAt(idx);
		String temp = dict.get(key);

		for (int j = 0; j < temp.length(); j++)
			helper(A, dict, ans, idx + 1, str + temp.charAt(j));
	}

	public static ArrayList<String> letterCombinations(String A) {
		Map<Character, String> dict = new HashMap<>();
		ArrayList<String> ans = new ArrayList<>();

		dict.put('0', "0");
		dict.put('1', "1");
		dict.put('2', "abc");
		dict.put('3', "def");
		dict.put('4', "ghi");
		dict.put('5', "jkl");
		dict.put('6', "mno");
		dict.put('7', "pqrs");
		dict.put('8', "tuv");
		dict.put('9', "wxyz");

		helper(A, dict, ans, 0, "");

		return ans;
	}

	public static void main(String[] args) {

		System.out.println(letterCombinations(TakeSingle.oneString()));

	}

}

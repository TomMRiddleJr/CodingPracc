package backtracking;

import java.util.*;
import imports.*;

public class GenerateAllParanthesesII {
	static ArrayList<String> ans;

	static void helper(int open, int close, String str) {
		if (open == 0 && close == 0) {
			ans.add(str);
			return;
		}

		if (open == close)
			helper(open - 1, close, str + "(");
		else if (open == 0)
			helper(open, close - 1, str + ")");
		else {
			helper(open - 1, close, str + "(");
			helper(open, close - 1, str + ")");
		}
	}

	public static ArrayList<String> generateParenthesis(int A) {
		ans = new ArrayList<>();
		helper(A, A, "");
		Collections.sort(ans);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(generateParenthesis(TakeSingle.oneInt()));
	}

}

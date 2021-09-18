package graph;

import java.util.*;
import imports.*;

public class WordSearchBoard {

	static int size, m, n;
	static String s;

	public static int exist(List<String> a, String str) {
		size = str.length();
		m = a.size();
		n = a.get(0).length();
		s = str;

		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				if (a.get(i).charAt(j) == str.charAt(0) && isWordPresent(a, i, j, 0))
					return 1;

		return 0;
	}

	private static boolean isWordPresent(List<String> matrix, int i, int j, int k) {
		if (k == size - 1)
			return true;

		if (isNotOutOfBound(i - 1, j) && matrix.get(i - 1).charAt(j) == s.charAt(k + 1)
				&& isWordPresent(matrix, i - 1, j, k + 1))
			return true;
		if (isNotOutOfBound(i + 1, j) && matrix.get(i + 1).charAt(j) == s.charAt(k + 1)
				&& isWordPresent(matrix, i + 1, j, k + 1))
			return true;
		if (isNotOutOfBound(i, j - 1) && matrix.get(i).charAt(j - 1) == s.charAt(k + 1)
				&& isWordPresent(matrix, i, j - 1, k + 1))
			return true;
		if (isNotOutOfBound(i, j + 1) && matrix.get(i).charAt(j + 1) == s.charAt(k + 1)
				&& isWordPresent(matrix, i, j + 1, k + 1))
			return true;

		return false;
	}

	private static boolean isNotOutOfBound(int i, int j) {
		if (i < 0 || i >= m || j < 0 || j >= n)
			return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(exist(TakeMultiple.Strr.strList(" "), TakeSingle.oneString()));

	}

}

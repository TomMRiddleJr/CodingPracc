package graph;

import java.util.*;
import imports.*;

public class BlackShapes {
	static Set<String> v;

	static void explore(int i, int j, List<String> A) {
		if (i < 0 || i == A.size() || j < 0 || j == A.get(i).length())
			return;
		if (A.get(i).charAt(j) != 'X' || v.contains(i + " " + j))
			return;

		v.add(i + " " + j);

		explore(i + 1, j, A);
		explore(i - 1, j, A);
		explore(i, j + 1, A);
		explore(i, j - 1, A);
	}

	public static int black(List<String> A) {
		v = new HashSet<>();
		int count = 0;

		for (int i = 0; i < A.size(); i++)
			for (int j = 0; j < A.get(0).length(); j++)
				if (!v.contains(i + " " + j) && A.get(i).charAt(j) == 'X') {
					count++;
					explore(i, j, A);
				}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(black(TakeMultiple.Strr.strList(" ")));

	}

}

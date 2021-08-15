package hashing;

import java.util.*;
import imports.*;

public class TwoOutOfThree {

	public static ArrayList<Integer> solve(List<Integer> A, List<Integer> B, List<Integer> C) {
		Set<Integer> a = new TreeSet<>(A);
		Set<Integer> b = new TreeSet<>(B);
		Set<Integer> c = new TreeSet<>(C);

		Set<Integer> temp = new TreeSet<>();
		ArrayList<Integer> ans = new ArrayList<>();

		for (int x : a)
			temp.add(x);
		for (int y : b) {
			if (temp.contains(y))
				ans.add(y);
			else
				temp.add(y);
		}
		for (int z : c) {
			if (temp.contains(z) && !ans.contains(z))
				ans.add(z);
			else
				temp.add(z);
		}

		Collections.sort(ans);

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(
				solve(TakeMultiple.Int.intList(" "), TakeMultiple.Int.intList(" "), TakeMultiple.Int.intList(" ")));

	}

}

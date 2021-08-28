package tree;

import java.util.*;
import imports.*;

public class OrderOfPeopleHeights {

	public static ArrayList<Integer> order(List<Integer> A, List<Integer> B) {
		ArrayList<Integer> sorted = new ArrayList<>();
		sorted.addAll(A);
		Collections.sort(sorted, Collections.reverseOrder());

		ArrayList<Integer> ans = new ArrayList<>(A.size());
		for (int i = 0; i < A.size(); i++)
			ans.add(-1);

		for (int i = 0; i < sorted.size(); i++) {
			int num = sorted.get(i);
			int idxToRem = A.indexOf(num);
			int pos = B.get(idxToRem);
			if (ans.get(pos) == -1)
				ans.set(pos, num);
			else
				ans.add(pos, num);

			A.set(idxToRem, -1);
		}

		sorted.clear();
		for (int i = 0; i < A.size(); i++)
			sorted.add(ans.get(i));

		return sorted;
	}

	public static void main(String[] args) {
		System.out.println(order(TakeMultiple.Int.intList(" "), TakeMultiple.Int.intList(" ")));
	}

}

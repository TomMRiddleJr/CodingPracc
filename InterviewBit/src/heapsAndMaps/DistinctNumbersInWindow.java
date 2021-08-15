package heapsAndMaps;

import java.util.*;
import imports.*;

public class DistinctNumbersInWindow {

	public static ArrayList<Integer> dNums(List<Integer> A, int B) {
		Map<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> ans = new ArrayList<>();
		int i = 0, j = 0;

		while (j < A.size()) {
			map.put(A.get(j), map.getOrDefault(A.get(j), 0) + 1);

			if (j - i + 1 == B) {
				ans.add(map.size());

				map.put(A.get(i), map.get(A.get(i)) - 1);
				if (map.get(A.get(i)) == 0)
					map.remove(A.get(i));
				i++;
			}

			j++;
		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(dNums(TakeMultiple.Int.intList(" "), TakeSingle.oneInt()));

	}

}

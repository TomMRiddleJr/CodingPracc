package heapsAndMaps;

import java.util.*;
import imports.*;

public class KLargestElements {

	public static ArrayList<Integer> solve(List<Integer> A, int B) {
		Queue<Integer> q = new PriorityQueue<>();

		for (int a : A) {
			q.offer(a);
			if (q.size() == B + 1)
				q.poll();
		}

		ArrayList<Integer> arr = new ArrayList<>();
		arr.addAll(q);

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solve(TakeMultiple.Int.intList(" "), TakeSingle.oneInt()));
	}

}

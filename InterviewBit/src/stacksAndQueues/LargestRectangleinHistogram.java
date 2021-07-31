package stacksAndQueues;

import imports.*;
import java.util.*;

public class LargestRectangleinHistogram {

	public static ArrayList<Integer> nsr(List<Integer> A) {
		Stack<ArrayList<Integer>> s = new Stack<>();
		ArrayList<Integer> l = new ArrayList<>();

		for (int i = A.size() - 1; i > -1; i--) {
			int n = A.get(i);
			while (!s.empty() && s.peek().get(1) >= n)
				s.pop();

			if (s.empty())
				l.add(A.size());
			else
				l.add(s.peek().get(0));

			ArrayList<Integer> temp = new ArrayList<>();
			temp.add(i);
			temp.add(n);
			s.add(temp);
		}

		Collections.reverse(l);

		return l;
	}

	public static ArrayList<Integer> nsl(List<Integer> A) {
		Stack<ArrayList<Integer>> s = new Stack<>();
		ArrayList<Integer> l = new ArrayList<>();

		for (int i = 0; i < A.size(); i++) {
			int n = A.get(i);
			while (!s.empty() && s.peek().get(1) >= n)
				s.pop();

			if (s.empty())
				l.add(-1);
			else
				l.add(s.peek().get(0));

			ArrayList<Integer> temp = new ArrayList<>();
			temp.add(i);
			temp.add(n);
			s.add(temp);
		}

		return l;
	}

	public static int largestRectangleArea(List<Integer> A) {
		int max = Integer.MIN_VALUE;
		ArrayList<Integer> left = nsl(A);
		ArrayList<Integer> right = nsr(A);

		for (int i = 0; i < A.size(); i++)
			max = Math.max(max, (right.get(i) - left.get(i) - 1) * A.get(i));

		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(largestRectangleArea(TakeMultiple.Int.intList(" ")));
	}

}

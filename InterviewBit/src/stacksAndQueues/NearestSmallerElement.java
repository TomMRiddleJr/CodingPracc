package stacksAndQueues;

import java.util.*;
import imports.*;

public class NearestSmallerElement {

	public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
		ArrayList<Integer> ans = new ArrayList<>();
		Stack<Integer> s = new Stack<>();

		/*
		 * Shorter way of writing the same loop as below
		 */
		for (int i : A) {

			while (!s.isEmpty() && i <= s.peek())
				s.pop();

			if (s.isEmpty())
				ans.add(-1);
			else
				ans.add(s.peek());

			s.add(i);
		}

		
		  
//	My way of writing loop - has a few redundancies. Same concept as above.		  
//		for (int a : A) {
//			if (s.empty())
//				ans.add(-1);
//			else {
//				if (a > s.peek())
//					ans.add(s.peek());
//				else {
//					while (!s.empty() && s.peek() >= a)
//						s.pop();
//
//					if (s.empty())
//						ans.add(-1);
//					else
//						ans.add(s.peek());
//				}
//			}
//
//			s.add(a);
//		}
		 

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(prevSmaller((ArrayList<Integer>) TakeMultiple.Int.intList(" ")));

	}

}

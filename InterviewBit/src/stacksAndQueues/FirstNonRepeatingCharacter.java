package stacksAndQueues;

import java.util.*;
import imports.*;

public class FirstNonRepeatingCharacter {

	public static String solve(String A) {
		StringBuilder ans = new StringBuilder();
		Queue<Character> q = new LinkedList<>();
		Set<Character> s = new HashSet<>();

		for (char c : A.toCharArray()) {
			if (s.contains(c))
				q.remove(c);
			else {
				s.add(c);
				q.offer(c);
			}

			ans.append(q.peek() == null ? '#' : q.peek());
		}

		return ans.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solve(TakeSingle.oneString()));

	}

}

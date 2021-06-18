package math;

import imports.*;
import java.util.*;

public class LenNValLessK {

	public static int solve(ArrayList<Integer> A, int B, int C) {

		if (A.size() == 0)
			return 0;
		if (C == 0)
			return 0;

		int i = 0;
		while (i < A.size()) {
			if (i != A.size() - 1 && A.get(i) == A.get(i + 1)) {
				A.remove(i);
			} else
				i++;
		}

		boolean b = false;
		if (A.get(0) == 0)
			b = true;

		int t = C, co = 0;
		while (t > 0) {
			co++;
			t /= 10;
		}

		int s = 0;
		if (B < co) {
			s = (int) Math.pow(A.size(), B - 1);
			if (b && B != 1)
				s *= A.size() - 1;
			else
				s *= A.size();
			return s;
		} else if (B > co)
			return 0;

		t = C;
		int d, n, c;
		while (B > 0) {
			if (B == 1) {
				c = count(A, t);
				s += c;
			} else {
				d = (int) Math.pow(10, B - 1);
				n = t / d;
				c = count(A, n);
				if (b && t == C)
					c--;
				s += c * Math.pow(A.size(), B - 1);
				if (!A.contains(n))
					break;
				t = t % d;
			}

			B--;

		}

		return s;

	}

	static int count(ArrayList<Integer> A, int B) {
		int c = 0;
		for (Integer i : A) {
			if (i < B)
				c++;
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(
				solve((ArrayList<Integer>) TakeMultiple.Int.intList(" "), TakeSingle.oneInt(), TakeSingle.oneInt()));

	}

}

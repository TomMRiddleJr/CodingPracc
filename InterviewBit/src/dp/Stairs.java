package dp;

import imports.*;

public class Stairs {

	public static int climbStairs(int A) {
		int[] t = new int[A + 1];

		for (int i = 0; i < A + 1; i++)
			if (i == 0)
				t[i] = 0;
			else if (i == 1 || i == 2)
				t[i] = i;
			else
				t[i] = t[i - 1] + t[i - 2];

		return t[A];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(climbStairs(TakeSingle.oneInt()));

	}

}

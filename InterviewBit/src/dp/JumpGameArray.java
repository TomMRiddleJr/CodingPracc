package dp;

import imports.*;

public class JumpGameArray {

	public static int canJump(int[] A) {
		int n = A.length;
		if (n == 1)
			return 1;
		int maxReachable = 0;

		for (int i = 0; i < n; i++) {
			if (A[i] == 0)
				if (maxReachable == i)
					return 0;
			maxReachable = Math.max(maxReachable, i + A[i]);
		}

		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(canJump(TakeMultiple.Int.intArray(" ")));

	}

}

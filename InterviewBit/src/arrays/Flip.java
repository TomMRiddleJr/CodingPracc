package arrays;

import imports.*;

public class Flip {

	public static int[] flip(String A) {
		int count = 0;
		int[] res = new int[2];
		int cur = 0;
		int l = 0;
		for (int r = 0; r < A.length(); ++r) {
			if (A.charAt(r) == '0')
				count++;
			else
				count--;

			if (count > cur) {
				res[0] = l + 1;
				res[1] = r + 1;
				cur = count;
			}

			if (count < 0) {
				count = 0;
				l = r + 1;
			}

		}
		return (res[0] == 0) ? new int[] {} : res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(flip(TakeSingle.oneString()));

	}

}

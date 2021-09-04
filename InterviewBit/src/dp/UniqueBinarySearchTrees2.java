package dp;

import imports.*;

public class UniqueBinarySearchTrees2 {

	public static int numTrees(int A) {
		int[] t = new int[A + 1];
		t[0] = 1;
		t[1] = 1;
		for (int k = 2; k < A + 1; k++) {
			int temp = 0;
			int i = 0, j = k - 1;
			while (j > i) {
				temp += 2 * t[i] * t[j];
				i++;
				j--;
			}
			if (i == j)
				temp += t[i] * t[j];
			t[k] = temp;
		}
		return t[A];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(numTrees(TakeSingle.oneInt()));

	}

}

package binarySearch;

import java.util.*;
import imports.*;

public class SearchInBitonicArray {

	public static int solve(ArrayList<Integer> A, int B) {

		int low = 0, mid = 0, high = A.size() - 1;
		int bIndex = -1;
		while (low <= high) {
			mid = (low + high) / 2;
			if (A.get(mid) > A.get(mid - 1) && A.get(mid) > A.get(mid + 1)) {
				bIndex = mid;
				break;
			} else if (A.get(mid) < A.get(mid - 1)) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		int ans = -1;

		int ans1 = binarySearch(A, 0, bIndex, B);
		int ans2 = binarySearch(A, bIndex + 1, A.size() - 1, B);

		return ans1 != -1 ? ans1 : ans2 != -1 ? ans2 : ans;
	}

	private static int binarySearch(ArrayList<Integer> A, int low, int high, int B) {
		int ans = -1;
		boolean reverse = false;
		if (low != 0)
			reverse = true;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (A.get(mid) == B) {
				ans = mid;
				break;
			}
			if (reverse) {
				if (A.get(mid) > B) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			} else {
				if (A.get(mid) < B) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}

			}
		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve((ArrayList<Integer>) TakeMultiple.Int.intList(", "), TakeSingle.oneInt()));
	}

}

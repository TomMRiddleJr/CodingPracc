package binarySearch;

import java.util.*;
import imports.*;

public class RotatedSortedArraySearch {
	
	public static int binarySearch(List<Integer> A, int low, int high, int key) {
		while(low <= high) {
			int mid = low + ((high - low) / 2);
			
			if(A.get(mid) == key) return mid;
			else if(A.get(mid) > key) high = mid - 1;
			else low = mid + 1;
		}
		
		return -1;
	}
	
	public static int binarySearchForMinElementInRotated(List<Integer> A, int low, int high) {
		while(low <= high) {
			int mid = low + ((high - low) / 2);
			int next = (mid + 1) % A.size();
			int prev = (mid - 1 + A.size()) % A.size();
			
			if(A.get(mid) <= A.get(next) && A.get(mid) <= A.get(prev)) return mid;
			else if(A.get(mid) >= A.get(low)) low = mid + 1;
			else high = mid - 1;
		}
		
		return 0;
	}
	
	public static int search(final List<Integer> A, int B) {
		int idx = binarySearchForMinElementInRotated(A, 0, A.size() - 1);
		if(A.get(idx) == B) return idx;
		int ans = binarySearch(A, idx + 1, A.size() - 1, B);
		if(ans == -1) {
			return binarySearch(A, 0, idx, B);
		} else return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(search(TakeMultiple.Int.intList(" "), TakeSingle.oneInt()));

	}

}

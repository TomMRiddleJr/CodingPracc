package binarySearch;

import java.util.*;
import imports.*;

public class SortedInsertPosition {
	
	static int binarySearch(ArrayList<Integer> a, int target) {
		int l = 0, r = a.size() - 1;
		int mid = -1;
		/*
		 * flag checks the index at which the loop exited was at the left or at the right
		 * helps in finding out where to insert the target
		 */
		boolean flag = true;
		while(r >= l) {
			mid = l + (r - l) / 2;
			if(a.get(mid) == target) return mid;
			else if(a.get(mid) > target) {
				r = mid - 1;
				flag = false;
			}
			else {
				l = mid + 1;
				flag = true;
			}
		}
		
		return flag ? mid + 1 : mid;
	}
	
	public static int searchInsert(ArrayList<Integer> a, int b) {
		if(b < a.get(0)) return 0;
		return binarySearch(a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(searchInsert((ArrayList<Integer>) TakeMultiple.Int.intList(" "), TakeSingle.oneInt()));

	}

}

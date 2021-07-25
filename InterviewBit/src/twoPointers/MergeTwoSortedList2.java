package twoPointers;

import java.util.*;
import imports.TakeMultiple;

public class MergeTwoSortedList2 {
	
	public static int binarySearch(ArrayList<Integer> A, int low, int high, int key) {
		while(high >= low) {
			int mid = low + ((high - low) / 2);
			
			if(A.get(mid).equals(key)) return mid;
			else if(A.get(mid) > key) high = mid - 1;
			else low = mid + 1;
		}
		
		return high;
	}
	
	public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
		int idx = -1;
		for(int i = 0; i < b.size(); i++) {
			idx = binarySearch(a, 0, a.size() - 1, b.get(i));
			a.add(idx + 1, b.get(i));
		}
		
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		merge((ArrayList<Integer>) TakeMultiple.Int.intList(" "), (ArrayList<Integer>) TakeMultiple.Int.intList(" "));
	}

}

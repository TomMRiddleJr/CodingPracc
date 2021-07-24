package twoPointers;

import java.util.*;
import imports.*;

public class PairWithGivenDifference {
	
	public static boolean binarySearch(ArrayList<Integer> A, int low, int high, int key) {
		while(high >= low) {
			int mid = low + ((high - low) / 2);
			
			if(A.get(mid).equals(key)) return true;
			else if(A.get(mid) > key) high = mid - 1;
			else low = mid + 1;
		}
		
		return false;
	}
	
	public static int solve(ArrayList<Integer> A, int B) {
		Collections.sort(A);
		
		for(int i = 0; i < A.size() - 1; i++) {
			if(B >= 0 && binarySearch(A, i + 1, A.size() - 1, A.get(i) + B)) return 1;
			if(B < 0 && binarySearch(A, 0, i, A.get(i) + B)) return 1;
		}
		
		return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solve((ArrayList<Integer>)TakeMultiple.Int.intList(", "), TakeSingle.oneInt()));

	}

}

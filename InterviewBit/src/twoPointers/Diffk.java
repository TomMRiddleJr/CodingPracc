package twoPointers;

import imports.*;
import java.util.*;

public class Diffk {
	
	public static int binarySearch(ArrayList<Integer> A, int low, int high, int key) {
		while(high >= low) {
			int mid = low + ((high - low) / 2);
			
			if(A.get(mid).equals(key)) return mid;
			else if(A.get(mid) > key) high = mid - 1;
			else low = mid + 1;
		}
		
		return -1;
	}
	
	public static int diffPossible(ArrayList<Integer> A, int B) {
		for(int i = 0; i < A.size() - 1; i++) if(binarySearch(A, i + 1, A.size() - 1, A.get(i) + B) != -1) return 1;
		return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(diffPossible((ArrayList<Integer>)TakeMultiple.Int.intList(" "), TakeSingle.oneInt()));

	}

}

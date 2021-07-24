package twoPointers;

import imports.*;
import java.util.*;

public class Diffk {
	
	public static int diffPossible(ArrayList<Integer> A, int B) {
		for(int i = 0; i < A.size(); i++) {
			if(A.indexOf(A.get(i) + B) != i &&  A.indexOf(A.get(i) + B) != -1) return 1;
		}
		
		return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(diffPossible((ArrayList<Integer>)TakeMultiple.Int.intList(" "), TakeSingle.oneInt()));

	}

}

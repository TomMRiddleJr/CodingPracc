package binarySearch;

import imports.TakeSingle;

public class SquareRootOfInteger {
	
	public static int sqrt(int A) {
		if(A == 0 || A == 1) return A;
		
		for(int i = 2; i <= A/2; ) {
			if(Math.pow(i, 2) == A) return i;
			else if(Math.pow(i, 2) > A) return i - 1;
			else {
				i++;
			}
		}
		return 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sqrt(TakeSingle.oneInt()));

	}

}

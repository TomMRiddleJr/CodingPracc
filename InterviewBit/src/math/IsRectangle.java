package math;

import imports.TakeSingle;

public class IsRectangle {
	
	public static int solve(int A, int B, int C, int D) {
		if(A == B) return C == D ? 1 : 0;
		else if(A == C) return B == D ? 1 : 0;
		else if(A == D) return B == C ? 1 : 0;
		else return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solve(TakeSingle.oneInt(), TakeSingle.oneInt(), TakeSingle.oneInt(), TakeSingle.oneInt()));

	}

}

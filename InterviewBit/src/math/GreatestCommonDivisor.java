package math;

import imports.TakeSingle;

public class GreatestCommonDivisor {
	
//	public static int gcd(int A, int B) {
//		if(A == B) return A;
//		if(A == 1 || B == 1 ) return 1;
//		if(A == 0) return B;
//		if(B == 0) return A;
//		
//		boolean flag = A > B;
//		if(!flag) {
//			int temp = A;
//			A = B;
//			B = temp;
//		}
//		
//		return gcd(B, A % B);
//    }
	
	public static int gcd(int a, int b) {
	    if(a == 0) return b;
	    return gcd(b%a, a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(gcd(TakeSingle.oneInt(), TakeSingle.oneInt()));
	}

}

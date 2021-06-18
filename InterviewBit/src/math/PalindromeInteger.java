package math;

import imports.TakeSingle;

public class PalindromeInteger {
	
	public static int isPalindrome(int A) {
		return Integer.toString(A).equals(new StringBuilder(Integer.toString(A)).reverse().toString()) ? 1 : 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPalindrome(TakeSingle.oneInt()));

	}

}

package math;

import imports.TakeSingle;

public class ExcelColumnNumber {
	
	public static int solve(String A, int count) {
		if (A.length() == 1) return Character.getNumericValue(A.charAt(0)) - 9;

		int num = (Character.getNumericValue(A.charAt(0)) - 9) * (int) Math.pow(26, count);
		A = A.substring(1);
		count--;

		return num + solve(A, count);
	}
	
	public static int titleToNumber(String A) {
		return solve(A, A.length() - 1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ans: " + titleToNumber(TakeSingle.oneString()));

	}

}

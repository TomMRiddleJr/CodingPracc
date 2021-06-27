package binarySearch;

import imports.TakeSingle;

public class ImplementPowerFunction {

	public static int pow(int x, int n, int d) {
		if (x == 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}

		if (x < 0) {
			return pow(x + d, n, d);
		}
		long ans;
		long temp = pow(x, n / 2, d);
		if (n % 2 == 0) {
			ans = ((temp % d) * (temp % d)) % d;
		} else {
			ans = ((((x % d) * (temp % d)) % d) * (temp % d)) % d;
		}

		return (int) ans;
	}

	/*
	 * 
	 * Bad Solution - time consuming
	 * 
	 * 
	 * public static int pow(int x, int n, int d) { x = x < 0 ? x + d : x > d ? x %
	 * d : x; BigInteger X = new BigInteger(Integer.toString(x)); BigInteger D = new
	 * BigInteger(Integer.toString(d));
	 * 
	 * BigInteger ANS = X.pow(n).remainder(D);
	 * 
	 * return ANS.intValue(); }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(pow(TakeSingle.oneInt(), TakeSingle.oneInt(), TakeSingle.oneInt()));

	}

}

package bitManipulation;

import java.util.*;

public class ReverseBits {

	/*
	 * BitWise Solution
	 */
	public static long reverse(long A) {
		long rev = 0;

		for (int i = 0; i < 32; i++) {
			rev <<= 1;
			if ((A & (1 << i)) != 0)
				rev |= 1;
		}

		return rev;

	}

	/*
	 * My Solution - uses libraries
	 * 
	 * public static long reverse(long a) { StringBuilder ans = new
	 * StringBuilder(Long.toBinaryString(a)); removes leading zeros ans.reverse();
	 * 
	 * while (ans.length() < 32) ans.append("0");
	 * 
	 * return Long.parseUnsignedLong(ans.toString(), 2); }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println(reverse(sc.nextLong()));

		sc.close();
	}

}

package strings;

import imports.TakeSingle;
import java.math.*;

public class Atoi {
	
	public static int atoi(final String A) {
		char[] arr = A.trim().toCharArray();
		
		StringBuilder str = new StringBuilder();
		
		int i = 0;
		if(arr[0] == '+' || arr[0] == '-') i = 1;
		
		for(;i < arr.length; i++) {
			char c = arr[i];
			if(Character.isDigit(c)) str.append(c);
			else break;
		}
		
		if(str.toString().isEmpty()) return 0;
		
		if(arr[0] == '-') str.insert(0, '-');
		
		BigInteger max = new BigInteger(Integer.toString(Integer.MAX_VALUE));
		BigInteger min = new BigInteger(Integer.toString(Integer.MIN_VALUE));
		
		BigInteger num = new BigInteger(str.toString());
		
		if(str.charAt(0) == '-' || num.compareTo(min) == -1) return min.intValue();
		else if(num.compareTo(max) == 1) return max.intValue();
		
		else return Integer.parseInt(str.toString());
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(atoi(TakeSingle.oneString()));

	}

}

package strings;

import imports.TakeSingle;

public class ImplementStrStr {
	
	public static int strStr(final String A, final String B) {
		if(B.isEmpty() || A.isEmpty() || A.length() < B.length()) return -1;
		
		int m = A.length();
		int n = B.length();
		
		for(int i = 0; i < m - n + 1; i++) {
			String str = A.substring(i, i + n);
			if(B.equals(str)) return i;
		}
		
		return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(strStr(TakeSingle.oneString(), TakeSingle.oneString()));

	}

}

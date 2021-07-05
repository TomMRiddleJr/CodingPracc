package strings;

import imports.TakeSingle;

public class ConvertToPalindrome {
	
	public static int solve(String A) {
		char[] chars = A.toCharArray();
		boolean remove = false;
		
		int i = 0, j = chars.length - 1;
		
		while(i < j) {
			if(chars[i] != chars[j]) {
				if(remove) break;
				remove = true;
				j--;
			} else {
				i++;
				j--;
			}
		}
		
		if(chars[i] == chars[j]) return 1;
		
		i = 0; j = chars.length - 1; remove = false;
		
		while(i < j) {
			if(chars[i] != chars[j]) {
				if(remove) return 0;
				remove = true;
				i++;
			} else {
				i++;
				j--;
			}
		}
		
		return 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solve(TakeSingle.oneString()));

	}

}

package strings;

import java.util.*;
import imports.TakeSingle;

public class RemoveConsecutiveCharacters {
	
	//My solution passed successfully with good time complexity
	
	/*
	 * Simpler solution 
	 * 
		 public String solve(String A, int K) {
	 		String res = "";
	        for(int i = 0; i < A.length(); ) {
	            int j = i;
	            while(j < A.length() && A.charAt(j) == A.charAt(i)) {
	                j++;
	            }
	            if(j - i == K) {
	                i = j;
	            } else {
	                res += A.charAt(i);
	                i++;
	            }
	        }
	        
	        return res;
	    }
	 */
	
	//My Solution
	public static String solve(String A, int B) {
		char temp = '0';
		int i = 1;
		char[] arr = A.toCharArray();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int j = 0; j < arr.length - 1; j++) {
			if (arr[j] == arr[j + 1]) {
				if (arr[j] == temp)
					map.put(j - i + 1, ++i);
				else
					map.put(j, ++i);
				temp = arr[j];
			} else {
				i = 1;
			}
		}
		
		for(int k = 0; k < arr.length; k++) {
			if(!map.containsKey(k)) map.put(k, 1);
			else k = k + map.get(k) - 1;
		}

		int r = 0;

		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() == B) {
				A = A.substring(0, e.getKey() - r) + A.substring(e.getKey() - r + B);
				r = r + B;
			}
		}
		

		return A;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solve(TakeSingle.oneString(), TakeSingle.oneInt()));

	}

}

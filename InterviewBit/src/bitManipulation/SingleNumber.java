package bitManipulation;

import java.util.*;
import imports.TakeMultiple;

public class SingleNumber {
	
	/*
	 * Better solution. XOR returns 0 when the numbers are same.
	 * x	y	Output
	 * 0	0	0
	 * 1	0	1
	 * 0	1	1
	 * 1	1	0
	 */
	public static int singleNumber(final List<Integer> A) {
        int ans = 0;
        
        for(int a : A) ans ^= a;
        
        return ans;
    }
	
	/*
	 * My Soution - uses extra space
	 * 
	public static int singleNumber(final List<Integer> A) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i : A)
			map.put(i, map.getOrDefault(i, 0) + 1);

		for (Map.Entry<Integer, Integer> e : map.entrySet())
			if (e.getValue() == 1)
				return e.getKey();

		return 0;
	}
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(singleNumber(TakeMultiple.Int.intList(" ")));
	}

}

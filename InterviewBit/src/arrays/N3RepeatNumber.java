package arrays;

import java.util.*;
import imports.TakeMultiple;

public class N3RepeatNumber {
	
	public static int repeatedNumber(final List<Integer> a) {
		double n = a.size() / 3.0;
		Map<Integer, Integer> map = new TreeMap<>();
		
		for(int i : a) { 
			if(map.containsKey(i)) map.put(i, map.get(i) + 1);
			else map.put(i, 1);
		}
		
		for(Map.Entry<Integer, Integer> e : map.entrySet()) if(e.getValue() > n) return e.getKey();
		
		return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(repeatedNumber(TakeMultiple.Int.intList(", ")));

	}

}

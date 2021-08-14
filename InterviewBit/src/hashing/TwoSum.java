package hashing;

import java.util.*;
import imports.*;

public class TwoSum {
	
	public static ArrayList<Integer> twoSum(final List<Integer> A, int B) {
		Map<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> ans = new ArrayList<>();
		
		for(int i = 0; i < A.size(); i++) {
			if(map.containsKey(A.get(i))) {
				ans.add(map.get(A.get(i)) + 1);
				ans.add(i + 1);
				break;
			}
			
			if(!map.containsKey(B - A.get(i)))map.put(B - A.get(i), i);
		}
		
		return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(twoSum(TakeMultiple.Int.intList(" "), TakeSingle.oneInt()));

	}

}

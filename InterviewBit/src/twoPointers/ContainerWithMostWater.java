package twoPointers;

import imports.*;
import java.util.*;

public class ContainerWithMostWater {
	
	/*
	 * Better Solution
	 */
	public static int maxArea(ArrayList<Integer> A) {
        long max = Integer.MIN_VALUE;
        if (A == null || A.size()<2) return 0;
        
        int start = 0;
        int end = A.size()-1;
        
        while (start<end){
            long water = (end-start)*Math.min(A.get(start), A.get(end));
            max = Math.max (water,max);
            if (A.get(start)<A.get(end)) start++;
            else end--;
        }
        return (int) max;
    }
	
	
	/*
	 * My Solution - Lengthy and unnecessary
	 * 
	public static int maxArea(ArrayList<Integer> A) {
		int ans = 0;
		ArrayList<Integer> left = new ArrayList<>();
		ArrayList<Integer> right = new ArrayList<>();
		left.add(A.get(0));
		right.add(A.get(A.size() - 1));
		for (int i = 1; i < A.size(); i++)
			left.add(Math.max(left.get(i - 1), A.get(i)));

		for (int j = A.size() - 2; j > -1; j--)
			right.add(Math.max(right.get(A.size() - j - 2), A.get(j)));

		Collections.reverse(right);

		ArrayList<Integer> height = new ArrayList<>();

		for (int k = 0; k < A.size(); k++)
			height.add(Math.min(left.get(k), right.get(k)));

		ArrayList<Integer> modHeight = new ArrayList<>();

		for (int m = 0; m < height.size() - 1; m++)
			modHeight.add(Math.min(height.get(m), height.get(m + 1)));
		Map<Integer, Integer> map = new TreeMap<>((i, j) -> j - i);

		for (int h : modHeight)
			map.put(h, map.getOrDefault(h, 0) + 1);

		int width = 0;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			width = width + entry.getValue();
			ans = Math.max(ans, entry.getKey() * width);
		}

		return ans;
	}
	
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(maxArea((ArrayList<Integer>) TakeMultiple.Int.intList(" ")));

	}

}

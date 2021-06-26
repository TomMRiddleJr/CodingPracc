package binarySearch;

import java.util.*;
import imports.TakeMultiple;

public class MedianOfArray {
	
	public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
		ArrayList<Integer> list = new ArrayList<>(a);
		list.addAll(b);
		Collections.sort(list);
		
		return list.size() % 2 == 1 ? list.get(list.size() / 2) : (list.get(list.size() / 2) + list.get((list.size() / 2) - 1)) / 2.0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<>(TakeMultiple.Int.intList(" "));
		ArrayList<Integer> b = new ArrayList<Integer>(TakeMultiple.Int.intList(" "));
		System.out.println(findMedianSortedArrays(a, b));

	}

}

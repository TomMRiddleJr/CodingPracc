package twoPointers;

import java.util.*;
import imports.TakeMultiple;

public class RemoveDuplicatesFromSortedArray {
	
	public static int removeDuplicates(ArrayList<Integer> a) {
        int i=a.size()-1;
        for(;i>0;i--)if(a.get(i).equals(a.get(i-1))) a.remove(i);
        return a.size();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(removeDuplicates((ArrayList<Integer>) TakeMultiple.Int.intList(" ")));

	}

}

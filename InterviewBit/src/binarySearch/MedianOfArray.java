package binarySearch;

import java.util.*;
import imports.TakeMultiple;

public class MedianOfArray {
	
	public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
		int medPos = (a.size() + b.size()) / 2;
		boolean isEven = (a.size() + b.size()) % 2 == 0;
		ArrayList<Integer> list = new ArrayList<>();
		int i = 0, j = 0;
		
		while(i < a.size() && j < b.size()) {
			if(list.size() == medPos + 1) break;
			
			if(a.get(i) > b.get(j)) {
				list.add(b.get(j));
				j++;
			}
			else {
				list.add(a.get(i));
				i++;
			}
		}
		
		while(list.size() != medPos + 1) {
			if(i == a.size()) {
				list.add(b.get(j));
				j++;
			} else {
				list.add(a.get(i));
				i++;
			}
		}
		
		if(isEven) return (list.get(list.size() - 1) + list.get(list.size() - 2)) / 2.0;
		
		return list.get(list.size() - 1);
	}
	
	/*
	 * InterviewBit Sol
	 * 
	 * public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        
        int low = 0;
        List<Integer> X = a.size()<b.size() ? a : b;
        List<Integer> Y = a.size()<b.size() ? b : a;
        
        int countUpToFirstElement = (a.size() + b.size()+1)/2;
        
        int partitionX  = (low + X.size()-1)/2;
        while(X.size() > 0 && low <= partitionX) {
             int partitionY = countUpToFirstElement - partitionX-2;
             int rightX = partitionX+1 < X.size() ?  X.get(partitionX+1) : Integer.MAX_VALUE;
             int rightY = partitionY+1 < Y.size() ?  Y.get(partitionY+1) : Integer.MAX_VALUE;
             
             if(X.get(partitionX) <= rightY && Y.get(partitionY) <= rightX) {
                 if((a.size() + b.size())%2 == 1 ){
                     return Math.max(X.get(partitionX), Y.get(partitionY));
                 } else {
                     return (Math.max(X.get(partitionX), Y.get(partitionY)) 
                     +Math.min(rightX, rightY))/2.0;
                 }
             } else if(X.get(partitionX) > rightY){
                 partitionX = partitionX-1;
             } else {
                 partitionX = partitionX+1;
             }
             
        }
        if(Y.size() == 0) {
            return -1;
        } 
        else if((a.size() + b.size())%2 == 1 ){
             return Y.get(countUpToFirstElement-1);
         } else {
             int rightX = X.size() > 0  ?  X.get(0) : Integer.MAX_VALUE;
             return (Y.get(countUpToFirstElement-1) 
             + Math.min(rightX, Y.get(countUpToFirstElement)))/2.0;
         }
        
    }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<>(TakeMultiple.Int.intList(" "));
		ArrayList<Integer> b = new ArrayList<Integer>(TakeMultiple.Int.intList(" "));
		System.out.println(findMedianSortedArrays(a, b));

	}

}

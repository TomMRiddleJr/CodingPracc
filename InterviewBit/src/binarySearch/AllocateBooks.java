package binarySearch;

import java.util.*;
import imports.*;

public class AllocateBooks {
	
	public static int books(ArrayList<Integer> a, int b) {
        int []c = new int[a.size()];
        if(a.size() < b) {
            return -1;
        }
        for(int i =0 ;i <a.size() ; i++) {
            c[i] = a.get(i);
        }
        return partition(c,c.length,b);
    }

    static int getMax(int A[], int n) {
        int max = -1;
        for (int i = 0; i < n; i++) {
            if (A[i] > max) max = A[i];
        }
        return max;
    }

    static int getSum(int A[], int n) {
        int total = 0;
        for (int i = 0; i < n; i++)
            total += A[i];
        return total;
    }

    static int getRequiredPainters(int A[], int n, int maxLengthPerPainter) {
        int total = 0, numPainters = 1;
        for (int i = 0; i < n; i++) {
            total += A[i];
            if (total > maxLengthPerPainter) {
                total = A[i];
                numPainters++;
            }
        }
        return numPainters;
    }

    static int partition(int A[], int n, int k) {
        int lo = getMax(A, n);
        int hi = getSum(A, n);

        while (lo < hi) {
            int mid = lo + (hi-lo)/2;
            int requiredPainters = getRequiredPainters(A, n, mid);
            if (requiredPainters <= k)
                hi = mid;
            else
                lo = mid+1;
        }
        return lo;
    }
    
    
    /*
     * Editorial Answer
     * 
     * public static int books(ArrayList<Integer> A, int B) {
        int len = A.size();
        if(len < B) return -1;
        int total =0 ; int max = Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            total += A.get(i);
            max = Math.max(max,A.get(i));
        }
        
        int lo = max;int hi = total;
        while(lo < hi) {
            int mid = lo + (hi-lo)/2;
            int requiredReaders = getRequiredReaders(A, mid);
            if(requiredReaders <= B) {
                hi = mid;
            }else {
                lo = mid + 1;                
            }
        }
        return lo;
    }
    
    private static int getRequiredReaders(ArrayList<Integer> a, int maxLengthPerReader) {
        int total = 0;
        int readers = 1;
        for(int i = 0; i < a.size(); i++) {
            total += a.get(i);
            if(total > maxLengthPerReader) {
                total = a.get(i);
                readers++;
            }
        }
        return readers;
    }
     */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(books((ArrayList<Integer>) TakeMultiple.Int.intList(", "), TakeSingle.oneInt()));

	}

}

package binarySearch;

import java.util.*;

public class MatrixSearch {
	
	public static int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {
		int j = A.get(0).size() - 1, i = 0;
		
		while(j > -1 && i < A.size()) {
			if(A.get(i).get(j) == B) return 1;
			else if(A.get(i).get(j) > B) j--;
			else i++;
		}
		
		return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

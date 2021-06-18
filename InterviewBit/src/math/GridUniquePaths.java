package math;

import imports.TakeSingle;

public class GridUniquePaths {
	
	public static int uniquePaths(int A, int B) {
		int[][] arr = new int[A][B];
		
		for(int i = 0; i < A; i++) for(int j = 0; j < B; j++) {
			if(i == 0 || j == 0) arr[i][j] = 1;
			else arr[i][j] = arr[i-1][j] + arr[i][j-1];
		}
		
		return arr[A - 1][B - 1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(uniquePaths(TakeSingle.oneInt(), TakeSingle.oneInt()));

	}

}

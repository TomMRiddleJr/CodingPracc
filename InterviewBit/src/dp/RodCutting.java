package dp;

import java.util.*;
import imports.*;

public class RodCutting {

	// Total correct implementation
	static ArrayList<Integer> result;
	static int[] cuts;
	static int[][] parent;

	public static ArrayList<Integer> rodCut(List<Integer> scores, int rod) {
		int n = scores.size() + 2;
		cuts = new int[n];
		cuts[0] = 0;
		for (int i = 0; i < scores.size(); i++) {
			cuts[i + 1] = scores.get(i);
		}
		cuts[n - 1] = rod;

		long[][] dp = new long[n][n];
		parent = new int[n][n];
		for (int len = 1; len <= n; len++) {
			for (int s = 0; s < n - len; s++) {
				int e = s + len;
				for (int k = s + 1; k < e; k++) {
					long sum = cuts[e] - cuts[s] + dp[s][k] + dp[k][e];
					if (dp[s][e] == 0 || sum < dp[s][e]) {
						dp[s][e] = sum;
						parent[s][e] = k;
					}
				}
			}
		}

		result = new ArrayList<>();
		backTrack(0, n - 1);

		return result;
	}

	private static void backTrack(int s, int e) {
		if (s + 1 >= e)
			return;

		result.add(cuts[parent[s][e]]);
		backTrack(s, parent[s][e]);
		backTrack(parent[s][e], e);
	}
	
	/*
	//My implementation
	//I am not sure with the helper. Helper helps priting the order of cuts. My dp matrix in rodCut function is correct.
	
	static String helper(int[][] t, String s, List<Integer> B, int x, int y) {
		if(x == 0) return s;
		
		if(x == 2) {
			if(t[x - 1][B.get(x - 1)] < t[x - 1][y] - B.get(x - 2)) return helper(t, B.get(x - 1)+""+B.get(x-2)+s, B, x - 2, B.get(x - 1));
			else return helper(t, B.get(x-2)+s+B.get(x - 1), B, x - 2, y - 1);
		}
		
		if(t[x - 1][B.get(x - 1)] < t[x - 1][y] - B.get(x - 2))return helper(t, B.get(x - 1)+s, B, x - 1, B.get(x - 1));
		else return helper(t, s+B.get(x - 1), B, x - 1, y);
		
	}
	
	public static ArrayList<Integer> rodCut(List<Integer> B, int A) {
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i = 0; i < B.size(); i++) ans.add(-1);
		Collections.sort(B);
		int[][] t = new int[B.size() + 1][A + 1];
		
		for(int i = 0; i < B.size() + 1; i++)
			for(int j = 0; j < A + 1; j++)
				if(i == 0 && j != 0) t[i][j] = Integer.MAX_VALUE;
				else if(j == 0) t[i][j] = 0;
				else if(i == 1 && j != 0) t[i][j] = j;
				else if(B.get(i - 1) <= j) t[i][j] = Math.min(t[i - 1][B.get(i - 1)] + j, t[i - 1][j] + j - B.get(i - 2));
				else t[i][j] = t[i - 1][j];
		
		for(int[] gg: t) {
			for(int g : gg) System.out.print(g+", ");
			System.out.println();
		}
		
//		String sol = helper(t, "", B, B.size(), A);
		
//		System.out.println(sol);
		
		return ans;
    }
    
    */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(rodCut(TakeMultiple.Int.intList(" "), TakeSingle.oneInt()));

	}

}

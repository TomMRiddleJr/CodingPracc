package graph;

import java.util.*;

public class DeleteEdge {

	long sum = 0;
	long ans = 0;
	long mod = 1000000007;

	public int dfs(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> adj, int cur, int par) {
		int s = 0;
		s += A.get(cur - 1);

		for (int ele : adj.get(cur))
			if (ele != par)
				s = s + dfs(A, adj, ele, cur);

		long res = ((s % mod) * (sum - s) % mod) % mod;
		ans = Math.max(res, ans);
		return s;
	}

	public int deleteEdge(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < A.size() + 1; i++)
			adj.add(new ArrayList<Integer>());

		for (int i = 0; i < A.size(); i++)
			sum += A.get(i);

		for (int i = 0; i < B.size(); i++) {
			adj.get(B.get(i).get(0)).add(B.get(i).get(1));
			adj.get(B.get(i).get(1)).add(B.get(i).get(0));
		}

		dfs(A, adj, 1, 0);
		return (int) ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

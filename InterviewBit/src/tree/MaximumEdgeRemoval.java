package tree;

import imports.*;
import java.util.*;

public class MaximumEdgeRemoval {

	static ArrayList<ArrayList<Integer>> graph;
	static int ans;

	public static int solve(int A, ArrayList<ArrayList<Integer>> B) {
		graph = new ArrayList<>();

		for (int i = 0; i <= A; i++)
			graph.add(new ArrayList<>());

		// Make the Tree
		for (ArrayList<Integer> edge : B) {
			graph.get(edge.get(0)).add(edge.get(1));
			graph.get(edge.get(1)).add(edge.get(0));
		}

		boolean vis[] = new boolean[A + 1];
		ans = 0;
		dfs(1, vis);
		return ans;
	}

	// dfs function to count the edge removel
	static int dfs(int start, boolean vis[]) {
		vis[start] = true;
		int currCount = 0;

		// call dfs for the current node's neighbours
		for (int neigh : graph.get(start)) {
			if (!vis[neigh]) {
				// count the no of nodes in the current subtree
				int nodeCount = dfs(neigh, vis);

				// if no of nodes are even, we can easily delete the edge
				if ((nodeCount & 1) == 0)
					ans++;

				// else add the no of nodes in current subtree
				else
					currCount += nodeCount;
			}
		}

		return currCount + 1; // 1 for the root node of current subtree
	}

	public static void main(String[] args) {
		int a = TakeSingle.oneInt();
		ArrayList<ArrayList<Integer>> in = new ArrayList<>();
		int i = 1;
		while (i < a)
			in.add((ArrayList<Integer>) TakeMultiple.Int.intList(" "));

		System.out.println(solve(a, in));
	}

}

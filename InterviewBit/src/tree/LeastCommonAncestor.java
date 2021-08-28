package tree;

import imports.*;

public class LeastCommonAncestor {

	static boolean find(TreeNode A, int target) {
		if (A == null)
			return false;
		if (A.val == target)
			return true;
		else
			return find(A.left, target) || find(A.right, target);
	}

	public int lca(TreeNode A, int B, int C) {
		if (A == null)
			return -1;
		if (B == C && find(A, B))
			return B;

		if (A.val == B) {
			if (find(A.left, C) || find(A.right, C))
				return A.val;
			else
				return -1;
		} else if (A.val == C) {
			if (find(A.left, B) || find(A.right, B))
				return A.val;
			else
				return -1;
		} else {
			if (find(A.left, B) && find(A.right, C))
				return A.val;
			else if (find(A.left, C) && find(A.right, B))
				return A.val;
		}

		boolean bInL = find(A.left, B);
		boolean cInL = find(A.left, C);

		boolean left = bInL && cInL;

		if (left)
			return lca(A.left, B, C);
		else
			return lca(A.right, B, C);
	}

}

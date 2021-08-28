package tree;

import imports.*;

public class IdenticalBinaryTree {

	public int isSameTree(TreeNode A, TreeNode B) {
		if (A == null && B == null)
			return 1;
		if (A == null && B != null)
			return 0;
		if (A != null && B == null)
			return 0;

		if (A.val != B.val)
			return 0;
		else
			return isSameTree(A.left, B.left) & isSameTree(A.right, B.right);
	}
}

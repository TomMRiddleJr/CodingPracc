package tree;

import imports.*;

public class InvertBinaryTree {

	public TreeNode invertTree(TreeNode A) {
		if (A == null)
			return null;

		TreeNode temp = new TreeNode(A.val);

		temp.left = invertTree(A.right);
		temp.right = invertTree(A.left);

		return temp;
	}

}

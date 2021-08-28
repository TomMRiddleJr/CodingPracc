package tree;

import imports.*;

public class FlattenBinaryTree {

	static TreeNode ans;

	static void helper(TreeNode a) {
		if (a == null)
			return;

		ans.right = new TreeNode(a.val);
		ans = ans.right;
		helper(a.left);
		helper(a.right);
	}

	public TreeNode flatten(TreeNode a) {
		ans = new TreeNode(a.val);
		TreeNode sol = ans;
		helper(a.left);
		helper(a.right);
		return sol;
	}

}

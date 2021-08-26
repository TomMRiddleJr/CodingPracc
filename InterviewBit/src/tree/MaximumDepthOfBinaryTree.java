package tree;

import imports.*;

public class MaximumDepthOfBinaryTree {

	static int ans;

	static int solve(TreeNode A) {
		if (A == null)
			return 0;
		int left = solve(A.left);
		int right = solve(A.right);
		int temp = Math.max(left, right) + 1;
		ans = temp;
		return temp;
	}

	public int maxDepth(TreeNode A) {
		ans = 0;
		solve(A);
		return ans;
	}

}

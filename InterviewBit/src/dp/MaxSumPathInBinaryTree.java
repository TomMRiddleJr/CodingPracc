package dp;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
		left = null;
		right = null;
	}
}

public class MaxSumPathInBinaryTree {

	static int ans;

	static int helper(TreeNode a) {
		if (a == null)
			return 0;

		int left = helper(a.left);
		int right = helper(a.right);

		int temp = Math.max(Math.max(left, right) + a.val, a.val);

		ans = Math.max(temp, Math.max(left + right + a.val, ans));

		return temp;
	}

	public int maxPathSum(TreeNode A) {
		ans = Integer.MIN_VALUE;
		int temp = helper(A);
		return ans;
	}

}

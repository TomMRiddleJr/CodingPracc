package tree;

class TreeLinkNode {
	int val;
	TreeLinkNode left, right, next;

	TreeLinkNode(int x) {
		val = x;
	}
}

public class PopulateNextRightPointersTree {

	public void connect(TreeLinkNode root) {

		if (root == null)
			return;

		TreeLinkNode cur = root;
		TreeLinkNode prev = null;

		while (cur != null) {
			if (prev == null)
				prev = cur.left;
			else if (prev != null && cur.left != null) {
				prev.next = cur.left;
				prev = prev.next;
			}

			if (prev == null)
				prev = cur.right;
			else if (prev != null && cur.right != null) {
				prev.next = cur.right;
				prev = prev.next;
			}

			cur = cur.next;
		}

		connect(root.left);

		connect(root.right);

	}

}

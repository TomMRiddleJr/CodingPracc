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
		boolean set = false;
		TreeLinkNode parent = root, levelNode = root;
		while (levelNode != null) {
			parent = levelNode;
			while (parent != null) {
				// Check for left child
				if (parent.left != null) {
					if (!set) {
						levelNode = parent.left;
						set = true;
					}
					if (parent.right != null)
						parent.left.next = parent.right;
					else {
						TreeLinkNode temp = parent.next;
						while (temp != null) {
							if (temp.left != null) {
								parent.left.next = temp.left;
								break;
							} else if (temp.right != null) {
								parent.left.next = temp.right;
								break;
							}
							temp = temp.next;
						}
					}
				}
				// Check for Right Child
				if (parent.right != null) {
					if (!set) {
						levelNode = parent.right;
						set = true;
					}
					TreeLinkNode temp = parent.next;
					while (temp != null) {
						if (temp.left != null) {
							parent.right.next = temp.left;
							break;
						} else if (temp.right != null) {
							parent.right.next = temp.right;
							break;
						}
						temp = temp.next;
					}
				}
				parent = parent.next;
			}
			if (!set)
				break;
			set = false;
		}
	}
}

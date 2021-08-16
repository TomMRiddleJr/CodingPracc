package tree;

import java.util.*;
import imports.*;

public class PostorderTraversal {

	public ArrayList<Integer> postorderTraversal(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp;
		stack.push(root);
		while (!stack.isEmpty()) {
			temp = stack.pop();
			result.add(0, temp.val);
			if (temp.left != null)
				stack.push(temp.left);
			if (temp.right != null)
				stack.push(temp.right);
		}
		return result;
	}

}

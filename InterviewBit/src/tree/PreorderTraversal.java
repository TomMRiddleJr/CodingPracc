package tree;

import java.util.*;
import imports.*;

public class PreorderTraversal {
	
	/*
	 * Iterative Approach
	 * 
	 * public ArrayList<Integer> preorderTraversal(TreeNode a) {
	    
	    TreeNode curr = a;
	    Stack<TreeNode> s = new Stack<>();
	    ArrayList<Integer> result = new ArrayList<>();
	    s.push(a);
	    while(!s.isEmpty()) {
	        curr = s.pop();
	        result.add(curr.val);
	        if(curr.right != null) {
	            s.push(curr.right);
	        }
	        if(curr.left != null) {
	            s.push(curr.left);
	        }
	    }
	    return result;
	}
	 * 
	 */

	static void helper(TreeNode A, ArrayList<Integer> ans) {
		if (A == null)
			return;
		TreeNode cur = A;
		ans.add(cur.val);
		helper(cur.left, ans);
		helper(cur.right, ans);
	}

	public static ArrayList<Integer> preorderTraversal(TreeNode A) {
		ArrayList<Integer> ans = new ArrayList<>();
		helper(A, ans);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

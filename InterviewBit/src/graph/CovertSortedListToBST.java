package graph;

import java.util.*;

//  Definition for binary tree
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

//  Definition for singly-linked list.
class ListNode {
	public int val;
	public ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class CovertSortedListToBST {

	static TreeNode helper(List<Integer> a) {
		if (a.size() == 0)
			return null;
		TreeNode ans = new TreeNode(a.get(a.size() / 2));
		ans.left = helper(a.subList(0, a.size() / 2));
		ans.right = helper(a.subList((a.size() / 2) + 1, a.size()));
		return ans;
	}

	public TreeNode sortedListToBST(ListNode a) {
		List<Integer> list = new ArrayList<>();
		TreeNode ans;
		while (a != null) {
			list.add(a.val);
			a = a.next;
		}
		return helper(list);
	}

}

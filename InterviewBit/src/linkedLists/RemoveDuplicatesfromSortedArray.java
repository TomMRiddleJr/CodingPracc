package linkedLists;

import imports.ListNode;

public class RemoveDuplicatesfromSortedArray {

	public ListNode deleteDuplicates(ListNode A) {
		ListNode current = A;
		while (current.next != null) {
			if (current.val == current.next.val) {
				ListNode B = current.next;
				current.next = B.next;
			} else
				current = current.next;
		}

		return A;
	}

}

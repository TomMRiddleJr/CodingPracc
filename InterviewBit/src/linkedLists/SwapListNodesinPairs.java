package linkedLists;

import imports.ListNode;

public class SwapListNodesinPairs {

	public ListNode swapPairs(ListNode A) {
		if (A == null || A.next == null)
			return A;
		ListNode temp = A.next;
		A.next = swapPairs(temp.next);
		temp.next = A;
		return temp;
	}

	/*
	 * 
	 * Fastest but actually nodes aren't swapped here but values are swapped.
	 * 
	 * public ListNode swapPairs(ListNode A) { ListNode current = A;
	 * 
	 * while(current.next != null) { int x = current.val; int y = current.next.val;
	 * 
	 * current.val = y; current.next.val = x;
	 * 
	 * if(current.next.next == null) break; current = current.next.next; }
	 * 
	 * return A; }
	 */

}

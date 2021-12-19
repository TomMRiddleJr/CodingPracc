package linkedLists;

import imports.*;

public class ReorderList {
	
	public  ListNode reverseList(ListNode root) {
		ListNode prev = null;
		ListNode curr = root;
		ListNode next = null;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return prev;
	}
	
    public ListNode reorderList(ListNode A) {
		if(A == null) return A;
		
		ListNode root = A; 
		ListNode slow = root;
		ListNode fast = slow.next;
		while(fast!= null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		ListNode middleNode = slow.next;
		slow.next = null;
		
		ListNode r = reverseList(middleNode);
		
		ListNode temp = root;
		
		while(temp!= null && r!= null) {
			ListNode next1 = temp.next;
			temp.next = r;
			ListNode rNext = r.next;
			r.next = next1;
			r = rNext;
			temp = next1;
		}
		
		return root;
    }

}

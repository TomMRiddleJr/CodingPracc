package linkedLists;

import imports.*;

public class ReverseLinkList2 {
	
	public ListNode reverseBetween(ListNode A, int B, int C) {
        int pos = 1;
        ListNode start = A;
        ListNode curr = A;
        while(pos < B){
            start = curr;
            curr = curr.next;
            pos++;
        }
        
        ListNode prev = null;
        ListNode curr2 = curr;
        ListNode next = null;
        
        while(pos <= C){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            pos++;
        }
        
        start.next = prev;
        curr2.next = curr;
        if(B == 1) return prev;
        return A;
    }

}

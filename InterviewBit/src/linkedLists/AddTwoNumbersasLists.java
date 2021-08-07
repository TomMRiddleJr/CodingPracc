package linkedLists;

import imports.*;

public class AddTwoNumbersasLists {

	public ListNode addTwoNumbers(ListNode A, ListNode B) {
		ListNode a = A;
		ListNode b = B;
		ListNode ans = new ListNode(0);
		ListNode p = ans;
		int carry = 0;

		while (a != null && b != null) {
			p.val = (a.val + b.val + carry) % 10;
			carry = (a.val + b.val + carry) / 10;
			a = a.next;
			b = b.next;
			if (a == null && b == null)
				break;
			p.next = new ListNode(0);
			p = p.next;
		}

		while (a != null) {
			p.val = (a.val + carry) % 10;
			carry = (a.val + carry) / 10;
			if (a.next != null) {
				p.next = new ListNode(0);
				p = p.next;
			}
			a = a.next;
		}

		while (b != null) {
			p.val = (b.val + carry) % 10;
			carry = (b.val + carry) / 10;
			if (b.next != null) {
				p.next = new ListNode(0);
				p = p.next;
			}
			b = b.next;
		}

		if (carry != 0)
			p.next = new ListNode(carry);

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

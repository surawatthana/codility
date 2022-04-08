package com.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.leetcode.ListNode;

class AddTwoNumbers {

	@Test
	void case1() {
		ListNode result = this.addTwoNumbers(new ListNode(2, new ListNode(4, new ListNode(3))),
				           new ListNode(5, new ListNode(6, new ListNode(4))));
		
		assertEquals(result, new ListNode(7, new ListNode(0, new ListNode(8))));
	}
	@Test
	void case2() {
		ListNode result = this.addTwoNumbers(new ListNode(0), new ListNode(0));
		assertEquals(result, new ListNode(0));
	}
	@Test
	void case3() {
		ListNode result = this.addTwoNumbers(
				new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))))),
				new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))));
		assertEquals(result, new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))))));
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode p, dummy = new ListNode();
		p = dummy;
		
		while (l1 != null || l2 != null || carry > 0) {
			if (l1 != null) {
				carry += l1.val;
				l1 = l1.next;
			}
			
			if (l2 != null) {
				carry += l2.val;
				l2 = l2.next;
			}
			
			p.next = new ListNode(carry % 10);
			p = p.next;
			carry /= 10;
		}
		
		return dummy.next;
	}

}

package com.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.ListNode;
import org.junit.jupiter.api.Test;

public class SwapNodesInPairs {

	@Test
	public void test01() {
		assertEquals(new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3)))),
	this.swapPairs(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))))));
	}

	public ListNode swapPairs(ListNode head) {
		ListNode returnNode = reverse(head);

		if (head.next != null && head.next.next != null) {
			returnNode.next.next = reverse(head.next.next);
		}

		return returnNode;
	}

	public ListNode reverse(ListNode head) {
		ListNode reverse = null;

		ListNode following = head.next;
		head.next = reverse;
		reverse = head;
		head = following;

		return reverse;
	}
}
package com.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeLinkedList {

	@Test
	void test() {
		assertFalse(this.isPalindrome(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))))));
		
	}

	public boolean isPalindrome(ListNode head) {
		ListNode fast = head, slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		if (fast != null) {
			slow = slow.next;
		}
		
		slow = reverse(slow);
		fast = head;
		
		while (slow != null) {
			if (fast.val != slow.val) {
				return false;
			}
			
			fast = fast.next;
			slow = slow.next;
		}
		
		return true;
	}
	
	public ListNode reverse(ListNode head) {
		ListNode reverse = null;
		
		while (head != null) {
			ListNode following = head.next;
			head.next = reverse;
			reverse = head;
			head = following;
		}
		
		return reverse;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

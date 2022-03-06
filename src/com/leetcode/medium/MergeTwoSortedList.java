package com.leetcode.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.leetcode.ListNode;

class MergeTwoSortedList {

	@Test
	void case1() {
		ListNode actual = this.mergeTwoLists(
				new ListNode(1, new ListNode(2, new ListNode(4))),
				new ListNode(1, new ListNode(3, new ListNode(4))));

		ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));

		assertEquals(expected, actual);
	}

	@Test
	public void case2() {
		ListNode actual = this.mergeTwoLists(null, new ListNode(0));

		ListNode expected = new ListNode(0);
		assertEquals(expected, actual);
	}
	
	@Test
	public void case3() {
		ListNode actual = this.mergeTwoLists(null, null);
		
		ListNode expected = null;
		assertEquals(expected, actual);
	}
	
	@Test
	public void case4() {
		ListNode actual = this.mergeTwoLists(new ListNode(5), new ListNode(1, new ListNode(2, new ListNode(4))));
		
		ListNode expected = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(5))));
		assertEquals(expected, actual);
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}

}

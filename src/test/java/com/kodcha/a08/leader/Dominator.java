package com.kodcha.a08.leader;


import java.util.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Dominator {

	@Test
	void test() {
		assertEquals(0, this.solution(new int[] { 3, 4, 3, 2, 3, -1, 3, 3 }));
	}

	public int solution(int[] A) {
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < A.length; i++) {
			if (stack.isEmpty()) {
				stack.push(A[i]);
			} else {
				if (stack.peek().intValue() == A[i]) {
					stack.push(A[i]);
				} else {
					stack.pop();
				}
			}
		}
		
		if (stack.isEmpty()) {
			return -1;
		}
		
		int candidate = stack.peek();
		int count = 0;
		int candidateIndex = -1;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == candidate) {
				count++;
				if (candidateIndex < 0) {
					candidateIndex = i;
				}
			}
		}
		if (count > (A.length / 2))
			return candidateIndex;

		return -1;
	}
}

//int dominator = stack.peek();
//
//for (int i = 0; i < A.length; i++) {
//	if(dominator == A[i]) {
//		return i;
//	}
//}
//
//throw new RuntimeException("it should not get here");

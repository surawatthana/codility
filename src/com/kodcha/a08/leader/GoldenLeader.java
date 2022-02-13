package com.kodcha.a08.leader;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Stack;

import org.junit.jupiter.api.Test;

class GoldenLeader {

	@Test
	void test() {
		assertEquals(6, new FastLeader().solution(new int[] { 6, 8, 4, 6, 8, 6, 6 })); 
		assertEquals(6, new GoldenLeader().solution(new int[] { 6, 8, 4, 6, 8, 6, 6 }));
	}

	public int solution(int[] A) {
//		LocalDateTime start = LocalDateTime.now();
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < A.length; i++) {
			if (stack.isEmpty()) {
				stack.add(A[i]);
			} else {
				if(stack.peek() == A[i]) {
					stack.push(A[i]);
				} else {
					stack.pop();
				}
			}
		}

//		System.out.println("golden nanos: " + Duration.between(start, LocalDateTime.now()).toNanos());
		return stack.peek();
	}

}

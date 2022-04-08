package com.kodcha.a16.greedyAlgorithm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxNonoverlappingSegments {

	@Test
	void test() {
		
		assertEquals(3, this.solution(new int[] {1,3,7,9,9}, new int[] {5,6,8,9,10}));
	}

	public int solution(int[] A, int[] B) {
		
		if (A == null || B == null || (A.length != B.length)) {
			throw new RuntimeException("array cannot be null");
		}
		
		if (A.length < 1) {
			return 0;
		}
		
		if (A.length < 2) {
			return A.length;
		}
		
		int counter = 1;
		int previousEnd = B[0];
		
		for (int i = 1; i < B.length; i++) {
			if (A[i] > previousEnd) {
				counter++;
				previousEnd = B[i];
			}
		}
		
		return counter;
	}
}

package com.kodcha.a02.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class CyclicRotation {

	@Test
	void test() {
		assertTrue(Arrays.equals(this.solution(new int[] { 3, 8, 9, 7, 6 }, 3), new int[] { 9, 7, 6, 3, 8 }));
		assertTrue(Arrays.equals(this.solution(new int[] { 1, 2, 3, 4 }, 4), new int[] { 1, 2, 3, 4 }));
	}

	public int[] solution(int[] A, int K) {
		int[] B = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			 int rotatedIndex = (i + K) % A.length;
			 B[rotatedIndex] = A[i];
		}

		return B;
	}
}

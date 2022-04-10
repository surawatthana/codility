package com.kodcha.a03.timecomplexity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyTapeEquilibrium {

	@Test
	void test() {
		assertEquals(1, new MyTapeEquilibrium().solution(new int[] { 3, 1, 2, 4, 3 }));
	}

	public int solution(int[] A) {

		int[] sumForward = new int[A.length];
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
			sumForward[i] = sum;
		}

		int[] sumBackward = new int[A.length];
		int sumBack = 0;
		for (int i = A.length - 1; i >= 0; i--) {
			sumBack += A[i];
			sumBackward[i] = sumBack;
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < A.length - 1; i++) {
			int absoluteDiff = Math.abs(sumForward[i] - sumBackward[i + 1]);
			min = Math.min(min, absoluteDiff);

			if (min == 0) {
				break;
			}
		}

		return min;

	}

}

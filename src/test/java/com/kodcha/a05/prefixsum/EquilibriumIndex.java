package com.kodcha.a05.prefixsum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquilibriumIndex {

	@Test
	void test() {
		assertEquals(3, new EquilibriumIndex().solution(new int[] { -7, 1, 5, 2, -4, 3, 0 }));
	}

	public int solution(int[] A) {

		int[] prefixSumArray = new int[A.length];
		int total = 0;

		for (int i = 0; i < A.length; i++) {
			total += A[i];
			prefixSumArray[i] = total;
		}

		for (int indexMiddle = 1; indexMiddle < prefixSumArray.length - 1; indexMiddle++) {
			int indexLeft = indexMiddle - 1;
			int sumLeft = prefixSumArray[indexLeft];
			int sumRight = prefixSumArray[A.length - 1] - prefixSumArray[indexMiddle];

			if (sumLeft == sumRight) {
				return indexMiddle;
			}
		}

		return 0;
	}
}

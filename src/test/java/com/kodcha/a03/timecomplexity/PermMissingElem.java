package com.kodcha.a03.timecomplexity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class PermMissingElem {

	@Test
	void test() {
		assertEquals(4, new PermMissingElem().solution(new int[] { 2, 3, 1, 5 }));
	}

	public int solution(int[] A) {

		if (A == null || A.length == 0) {
			return 1;
		}

		Arrays.sort(A);

		// first element not right
		if (A[0] != 1) {
			return 1;
		}

		// last element not right
		if (A[A.length - 1] != A.length + 1) {
			return A.length + 1;
		}

		// something in between not right
		for (int i = 0, j = 1; i < A.length - 1; i++, j = i + 1) {
			if (A[i] + 1 != A[j]) {
				return A[i] + 1;
			}
		}

		throw new RuntimeException();
	}

}

package com.kodcha.a15.caterpillar;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class CountTriangles {

	@Test
	void test() {
		assertEquals(4, new CountTriangles().solution(new int[] { 10, 2, 5, 1, 8, 12 }));
	}

	public int solution(int[] A) {
		Arrays.sort(A);
		// 1, 2, 5, 8, 10, 12
		int triangle = 0;

		for (int tail = 0; tail < A.length - 2; tail++) {
			int head = tail + 2;

			for (int middle = tail + 1; middle < A.length - 1; middle++) {

				while (head < A.length && A[tail] + A[middle] > A[head]) {
					head++;
				}

				triangle += head - middle - 1;
			}
		}
		return triangle;
	}

	public int solution_v1(int[] A) {
		int count = 0;

		for (int i = 0; i < A.length - 2; i++) {
			int p = A[i];
			for (int j = i + 1; j < A.length - 1; j++) {
				int q = A[j];
				for (int k = j + 1; k < A.length; k++) {
					int r = A[k];
					if ((p + q > r) && (q + r > p) && (r + p > q)) {
						count++;
					}
				}
			}
		}

		return count;
	}
}

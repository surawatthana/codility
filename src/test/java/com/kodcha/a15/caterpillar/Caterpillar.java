package com.kodcha.a15.caterpillar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Caterpillar {

	@Test
	void test01() {
		assertTrue(new Caterpillar().caterpillar(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 9));
	}

	@Test
	void test02() {
		assertTrue(new Caterpillar().caterpillar(new int[] { 6, 2, 7, 4, 1, 3, 6 }, 12));
	}

	public boolean caterpillar(int[] A, int s) {
		int front = 0, total = 0;

		for (int i = 0; i < A.length; i++) {

			if (total < s) {
				total += A[i];
				continue;
			} else if (total == s) {
				return true;
			} else {
				total -= A[front];

				if (total == s) {
					return true;
				}
				i--;
				front++;
			}
		}

		return false;
	}

}

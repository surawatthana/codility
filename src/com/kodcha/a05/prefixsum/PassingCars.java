package com.kodcha.a05.prefixsum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PassingCars {

	@Test
	void test() {
		assertEquals(solution(new int[] { 0, 1, 0, 1, 1 }), 5);

	}

	public int solution(int[] A) {
		int countZero = 0;
		int pair = 0;
		int counter = 0;
		for (int i = A.length - 1; i >= 0; i--) {
			counter++;
			if (A[i] == 0) {
				countZero++;
				pair += counter - countZero;
				if (pair > 1000000000) {
					return -1;
				}
			}
		}
		return pair;
	}

}

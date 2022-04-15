package com.kodcha.a05.prefixsum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PassingCars {

	@Test
	void test() {
		assertEquals(solution(new int[] { 0, 1, 0, 1, 1 }), 5);
	}

	public int solution(int[] A) {
		int eastboundCars = 0;
		int passingCars = 0;

		for (int a : A) {
			if (a == 0) {
				eastboundCars++;
			} else {
				passingCars += eastboundCars;
			}
		}

		return Math.abs(passingCars) > 1_000_000_000 ? -1 : passingCars;
	}

}

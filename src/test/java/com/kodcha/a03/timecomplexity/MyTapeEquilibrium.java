package com.kodcha.a03.timecomplexity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyTapeEquilibrium {

	@Test
	void test01() {
		assertEquals(1, new MyTapeEquilibrium().solution(new int[] { 3, 1, 2, 4, 3 }));
	}

	@Test
	void test02() {
		assertEquals(2000, new MyTapeEquilibrium().solution(new int[] { 0, 2000 }));
	}

	@Test
	void test03() {
		assertEquals(2000, new MyTapeEquilibrium().solution(new int[] { 2000, 4000 }));
	}

	@Test
	void test04() {
		assertEquals(20, new MyTapeEquilibrium().solution(new int[] { 0, 20 }));
	}

	@Test
	void test05() {
		assertEquals(20, new MyTapeEquilibrium().solution(new int[] { 20, 40 }));
	}

	@Test
	void test06() {
		assertEquals(1, new MyTapeEquilibrium().solution(new int[] { -3, 1, 2, -4, 3 }));
		assertEquals(4, new MyTapeEquilibrium().solution(new int[] { 5, 2, 7, 10 }));
		assertEquals(490, new MyTapeEquilibrium().solution(new int[] { -1000, 1000, -500, 990 }));
		assertEquals(1, new MyTapeEquilibrium().solution(new int[] { 1, 2 }));
		assertEquals(125, new MyTapeEquilibrium().solution(new int[] { 100, -25 }));
	}

	public int solution(int[] A) {
		int sumAll = 0;
		for (int i = 0; i < A.length; i++) {
			sumAll += A[i];
		}

		int minDifference = Integer.MAX_VALUE;
		int currentDifference = 0;
		int resultLeft = 0;
		int resultRight = 0;

		for (int i = 0; i < A.length - 1; i++) {
			resultLeft += A[i];
			resultRight = sumAll - resultLeft;
			currentDifference = Math.abs(resultLeft - resultRight);
			minDifference = Math.min(minDifference, currentDifference);
		}

		return minDifference;
	}

}

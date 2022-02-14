package com.kodcha.a09.maxSlice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxSliceSum {

	@Test
	void test() {
		assertEquals(5, this.solution(new int[] {3,2,-6,4,0}));
	}

	public int solution(int[] A) {
		int maxEnding = 0, maxSlice = 0;
		for (int a: A) {
			maxEnding = Math.max(0, (maxEnding + a));
			maxSlice  = Math.max(maxEnding, maxSlice);
			System.out.println("");
		}
		
		return maxSlice;
	}
}

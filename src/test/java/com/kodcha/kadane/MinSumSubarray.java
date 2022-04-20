package com.kodcha.kadane;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinSumSubarray {

	@Test
	void test() {
		assertEquals(-2, new MinSumSubarray().solution(new int[] {-2, 3, -1, 2}));
	}
	
	public int solution(int[] A) {
		int currentSum = 0;
		int minSum = Integer.MAX_VALUE;
		
		for (Integer a : A) {
			currentSum += a;
			
			if (currentSum < minSum) {
				minSum = currentSum;
			}
		}
		
		return minSum;
	}

}

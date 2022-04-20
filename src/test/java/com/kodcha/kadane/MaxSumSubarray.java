package com.kodcha.kadane;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxSumSubarray {

	@Test
	void test1() {
		assertEquals(4, new MaxSumSubarray().solution(new int[] {-2, 3, -1, 2}));
	}
	
	@Test
	void test2() {
		assertEquals(16, new MaxSumSubarray().solution(new int[] {1, 3, 8, -2, 6, -8, 5}));
	}
	
	public int solution(int[] A) {
		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for (Integer a: A) {
			currentSum += a;
			
			if (currentSum > maxSum) {
				maxSum = currentSum;
			} 
			
			if (currentSum < 0) {
				currentSum = 0;
			}
		}
		
		return maxSum;
	}

}

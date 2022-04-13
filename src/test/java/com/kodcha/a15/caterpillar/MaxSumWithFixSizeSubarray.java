package com.kodcha.a15.caterpillar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxSumWithFixSizeSubarray {

	@Test
	void test() {
		assertEquals(16, new MaxSumWithFixSizeSubarray().solution(new int[] {4,2,1,7,8,1,2,8,1,0}, 3));
	}
	
	public int solution(int[] A, int size) {
		int max = Integer.MIN_VALUE;
		int currentValue = 0;
		
		for (int i = 0; i<A.length; i++) {
			currentValue += A[i];
			
			if (i >= size - 1) {
				max = Math.max(currentValue, max);
				currentValue -= A[i - (size - 1)];
			}
		}
		
		return max;
	}
	
	public int mineSolution(int[] A, int size) {
		
		int currentValue = 0, maxValue = Integer.MIN_VALUE, headIndex = 0 + size - 1, tailIndex = 0;
		
		// get MaxValue from first subarray.
		for (int i = tailIndex; i <= headIndex; i++) {
			currentValue += A[i];
			maxValue = Math.max(currentValue, maxValue);
		}
		
		while (headIndex < A.length - 1) {
			currentValue -= A[tailIndex];
			
			if (headIndex < A.length) {
				headIndex++;
				tailIndex++;
			}
			
			currentValue += A[headIndex];
			maxValue = Math.max(currentValue, maxValue);
		}
		
		return maxValue;
	}

}

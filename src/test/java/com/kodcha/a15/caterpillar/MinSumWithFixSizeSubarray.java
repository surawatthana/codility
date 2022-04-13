package com.kodcha.a15.caterpillar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinSumWithFixSizeSubarray {

	@Test
	void test1() {
		assertEquals(8, new MinSumWithFixSizeSubarray().solution(new int[] {4,2,2,7,8,1,2,8,1,0}, 3));
	}
	
	@Test
	void test2() {
		assertEquals(0, new MinSumWithFixSizeSubarray().solution(new int[] {4,2,2,7,8,1,2,8,1,0}, 1));
	}
	
	public int solution(int[] A, int size) {
		int min = Integer.MAX_VALUE;
		int currentValue = 0;
		
		for (int i = 0; i<A.length; i++) {
			currentValue += A[i];
			
			if (i >= size - 1) {
				min = Math.min(currentValue, min);
				currentValue -= A[i - (size - 1)];
			}
		}
		
		return min;
	}
	
 

}

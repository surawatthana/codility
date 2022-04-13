package com.kodcha.a15.caterpillar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaxSumSubArrayWithDefinedSize {

	@Test
	void test01() {
		assertEquals(5, new MaxSumSubArrayWithDefinedSize().maxValueFromSubArray(new int[] {-1, 2, 3, 1, -1, 2}, 2));
	}
	
	@Test
	void test02() {
		assertEquals(6, new MaxSumSubArrayWithDefinedSize().maxValueFromSubArray(new int[] {-1, 2, 3, 1, -1, 2}, 3));
	}
	
	@Test
	void test03() {
		assertEquals(10, new MaxSumSubArrayWithDefinedSize().maxValueFromSubArray(new int[] {-1, 2, 3, 1, -1, 10}, 3));
	}
	
	public int maxValueFromSubArray(int[] A, int size) {
		int numberOfNextPointers = size - 1;
		
		int max = Integer.MIN_VALUE;
		
		HERE:
		for(int i = 0; i<A.length; i++) {
			int value = A[i];
			for (int j = i + 1; j<= i + numberOfNextPointers; j++) {
				value += A[j];
				
				// to last element
				if (j == A.length - 1) {
					max = Math.max(max, value);
					break HERE;
				}
			}
			
			max = Math.max(max, value);
		}
		
		return max;
	}
	
 
		 

}

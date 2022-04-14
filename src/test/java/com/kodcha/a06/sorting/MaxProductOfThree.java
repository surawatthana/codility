package com.kodcha.a06.sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MaxProductOfThree {

	@Test
	void test() {
		assertEquals(60,  this.solution(new int[] {-3, 1, 2, -2, 5, 6}));
	}
	
	public int solution(int[] A) {
		Arrays.sort(A);
		
		int productOf3Largest = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
		int productOfLargestElementWith2SmallestElements = A[A.length - 1] * A[0] * A[1];
		
		return Math.max( productOf3Largest, productOfLargestElementWith2SmallestElements );
	}
	

}

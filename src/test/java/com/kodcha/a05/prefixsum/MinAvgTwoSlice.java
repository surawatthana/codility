package com.kodcha.a05.prefixsum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinAvgTwoSlice {

	@Test
	void test() {
		assertEquals(1, new MinAvgTwoSlice().solution(new int[] {4,2,2,5,1,5,8}));
	}
	
	public int solution(int[] A) {
		
		int indexOfMinOf2 = -1;
		double minSumOf2 = Integer.MAX_VALUE;
		
		int indexOfMinOf3 = -1;
		double minSumOf3 = Integer.MAX_VALUE;
		
		
		for (int i = 0; i< A.length -1; i++) {
			int val1 = A[i];
			int val2 = A[i+1];
			int val3 = 0;
			
			int sumOf2 = val1 + val2;
			
			if (sumOf2 < minSumOf2) {
				minSumOf2 = sumOf2;
				indexOfMinOf2 = i;
			}
			
			if (i < A.length - 2) {
				val1 = A[i];
				val2 = A[i+1];
				val3 = A[i+2];
				
				int sumOf3 = val1 + val2 + val3;
				
				if (sumOf3 < minSumOf3) {
					minSumOf3 = sumOf3;
					indexOfMinOf3 = i;
				}
				
			}
		}
		
		if (indexOfMinOf3 == -1) {
			return indexOfMinOf2;
		}
		
		minSumOf2 /= 2;
		minSumOf3 /= 3;
		
		if (minSumOf2 < minSumOf3) {
			return indexOfMinOf2;
		}
		
		if (minSumOf3 < minSumOf2) {
			return indexOfMinOf3;
		}
		
		return Math.min(indexOfMinOf2, indexOfMinOf3);
	}

}

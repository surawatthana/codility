package com.kodcha.a06.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class Distinct {

	@Test
	void test() {
		assertTrue( this.solution(new int[] {2,1,1,2,3,1}) == 3 );
	}
	
	public int solution(int[] A) {
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		// Step 1: determine min and max
		for (int i = 0; i < A.length; i++) {
			min = Math.min(min, A[i]);
			max = Math.max(max, A[i]);
		}
		
		// Step 2: determine array size
		int[] indexHoldingArray = new int [max-min+1];
		
		// Step 3: install in counting array
		for (int i =0; i<A.length ; i++) {
			int index = A[i] - min;
			int value  = indexHoldingArray[index] + 1;
			
			indexHoldingArray[index] = value;
		}
		
		// Step 4: find distinct
		int distinctIndex = 0;
		for (int i = 0; i< indexHoldingArray.length; i++) {
			if (indexHoldingArray[i] == 1) {
				distinctIndex = i;
				break;
			}
		}
		
		return distinctIndex + min;
	}
}

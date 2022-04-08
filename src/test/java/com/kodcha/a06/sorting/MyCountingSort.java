package com.kodcha.a06.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MyCountingSort {

	@Test
	void test() {
		assertTrue(Arrays.equals( new int[] { -2, 2, 2, 4, 5, 7 }, this.solution(new int[] { 4, 5, 7, -2, 2, 2 })));
		assertTrue(Arrays.equals( new int[] {  2, 4, 5, 7, 8, 9 }, this.solution(new int[] { 7, 8, 5, 4, 9, 2 })));
	}

	public int[] solution(int[] A) {
		LocalDateTime start = LocalDateTime.now();
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
		
		// Step 4: populate to array
		int[] returningArray = new int[A.length];
		int currentIndex = 0;
		for (int i = 0; i<indexHoldingArray.length; i++ ) {
			if(indexHoldingArray[i] > 0) {
				for (int j = 0; j< indexHoldingArray[i]; j++) {
					int actualValue = i + min;
					returningArray[currentIndex] = actualValue;
					currentIndex++;
				}
			}
		}
//		System.out.println("counting sort in nanos: " + Duration.between(start, LocalDateTime.now()).toNanos());
		return returningArray;
	}

}

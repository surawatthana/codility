package com.kodcha.a09.maxSlice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxSlice {

	@Test
	void test() {
//		assertEquals(10, this.bigONsquareSolution(new int[] {5, -7, 3, 5, -2, 4, -1}));
		assertEquals(10, this.bigONSolution(new int[] {5, -7, 3, 5, -2, 4, -1}));
	}
	
 
	
	public int bigONSolution(int[] A) {
		int maxEnding = 0, maxSlice = 0;
		for (int a: A) {
			maxEnding = Math.max(0, (maxEnding + a));
			maxSlice  = Math.max(maxEnding, maxSlice);
			System.out.println("");
		}
		
		return maxSlice;
	}
	
//			[5, -7, 3, 5, -2,  4, -1]
//maxEnding	 5   0  3  8   6  10  9		Math.max(0, (maxEnding + a));
//maxSlice 	 5   5  5  8   8  10  10    Math.max(maxEnding, maxSlice);

}

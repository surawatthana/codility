package com.interviewbit.veryeasy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreaterOfLesser {

	@Test
	void test1() {
		assertEquals(0, new GreaterOfLesser().solve(new int[] {1, 2, 3, 4}, new int[] {5, 6, 7, 8}, 4));
	}
	
	@Test
	void test2() {
		assertEquals(3, new GreaterOfLesser().solve(new int[] {1, 10, 100}, new int[] {9, 9, 9}, 50));
	}
	
	public int solve(int[] A, int[] B, int C) {

        int numberAGreaterThanC = 0;
        int numberBLessThanC = 0;

        for (int i = 0; i<A.length; i++) {
            if (A[i] > C) {
                numberAGreaterThanC++;
            }
            if (B[i] < C) {
                numberBLessThanC++;
            }
        }

        return Math.max(numberAGreaterThanC, numberBLessThanC);
    }

}

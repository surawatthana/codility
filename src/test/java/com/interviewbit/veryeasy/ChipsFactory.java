package com.interviewbit.veryeasy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ChipsFactory {

	@Test
	void test1() {
		assertTrue(Arrays.equals(new int[] { 1, 2, 3, 0 }, new ChipsFactory().solve(new int[] { 0, 1, 2, 3 })));
	}

	@Test
	void test2() {
		assertTrue(Arrays.equals(new int[] { 1, 0, 0, 0 }, new ChipsFactory().solve(new int[] { 1, 0, 0, 0 })));
	}

	public int[] solve(int[] A) {

		int[] result = new int[A.length];

		int index = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				result[index] = A[i];
				index++;
			}
		}

		return result;
	}

}

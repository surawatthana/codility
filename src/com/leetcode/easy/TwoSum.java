package com.leetcode.easy;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class TwoSum {
	@Test
	void test() {

		assertTrue(Arrays.equals(new int[] { 0, 1 }, new TwoSumSolution().twoSum(new int[] { 2, 7, 11, 15 }, 9)));
		assertTrue(Arrays.equals(new int[] { 1, 2 }, new TwoSumSolution().twoSum(new int[] { 3, 2, 4 }, 6)));
		assertTrue(Arrays.equals(new int[] { 0, 1 }, new TwoSumSolution().twoSum(new int[] { 3, 3 }, 6)));
		assertTrue(Arrays.equals(new int[] { 0, 2 }, new TwoSumSolution().twoSum(new int[] { 3, 2, 3 }, 6)));
	}

	class TwoSumSolution {
		public int[] twoSum(int[] nums, int target) {
			for (int i = 0; i < nums.length - 1; i++) {
				for (int j = i+1; j< nums.length; j++) {
					if (nums[i] + nums[j] == target) {
						return new int[] {i, j};
					}
				}
			}
			
			return new int[2];
		}
	}
}

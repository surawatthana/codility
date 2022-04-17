package com.kodcha.a05.prefixsum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubarraySum {

	@Test
	void test() {
		assertEquals(new int[] { 2, 4 }, new SubarraySum().solution(new int[] { 1, 4, 20, 3, 10, 5 }, 33));
	}

	public int[] solution(int[] A, int sum) {
		int curr_sum = A[0], start = 0;

		// Pick a starting point
		for (int i = 1; i <= A.length; i++) {
			// If curr_sum exceeds the sum,
			// then remove the starting elements
			while (curr_sum > sum && start < i - 1) {
				curr_sum = curr_sum - A[start];
				start++;
			}

			// If curr_sum becomes equal to sum,
			// then return true
			if (curr_sum == sum) {
				int p = i - 1;
				System.out.println("Sum found between indexes " + start + " and " + p);
				return new int[] { start, p };
			}

			// Add this element to curr_sum
			if (i < A.length)
				curr_sum = curr_sum + A[i];
		}

		System.out.println("No subarray found");
		return new int[] { 0 };
	}

}

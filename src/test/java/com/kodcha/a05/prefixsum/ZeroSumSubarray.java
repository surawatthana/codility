package com.kodcha.a05.prefixsum;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class ZeroSumSubarray {

	@Test
	void test1() {
		assertTrue(new ZeroSumSubarray().solution(new int[] { 4, 2, -3, 1, 6 }));
	}

	public boolean solution(int arr[]) {
		Set<Integer> hs = new HashSet<Integer>();

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (arr[i] == 0 || sum == 0 || hs.contains(sum))
				return true;

			hs.add(sum);
		}

		return false;
	}
}

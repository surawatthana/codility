package io.algoexpert.easy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class NonConstructibleChange {

	@Test
	void test() {
		assertEquals(20, new NonConstructibleChange().solve(new int[] { 1, 1, 2, 3, 5, 7, 22 }));
	}

	public int solve(int[] coins) {

		Arrays.sort(coins);

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < coins.length; i++) {
			set.add(coins[i]);
		}

		int prefixSum = 0;
		for (int i = 0; i < coins.length; i++) {
			prefixSum += coins[i];
			set.add(prefixSum);
		}

		LEVEL1: for (int i = 0; i < coins.length; i++) {
			int maxValue = 0;

			for (int j = 0; j < i; j++) {
				maxValue += coins[i];
			}

			for (int j = 1; j <= maxValue; j++) {
				if (set.contains(j)) {
					continue;
				} else {
					int mySum = 0;
					for (int k = 0; k < i; k++) {
						mySum = coins[k];
						if (mySum == j) {
							continue LEVEL1;
						}

						if (mySum < j) {
							continue;
						}

						if (mySum > i) {
							for (int l = 0; l < k; l++) {
								mySum -= coins[l];

								if (mySum == j) {
									continue LEVEL1;
								}

								if (mySum > j) {
									continue;
								}

								if (mySum < j) {
									return j;
								}
							}
						}
					}
				}
			}
		}
		return 1;
	}
}

package com.kodcha.a15.caterpillar;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class CountDistinctSlices {

	@Test
	void test() {
		assertEquals(9, new CountDistinctSlices().solutionFromYoutube(6, new int[] { 3, 4, 5, 5, 2 }));
	}

	public int solutionFromYoutube(int M, int[] A) {
		final int ONE_BILLION = 1_000_000_000;
		int headPointer = 0;
		int tailPointer = 0;
		int counter = 0;
		Set<Integer> set = new HashSet<>();

		while (headPointer < A.length || tailPointer < A.length) {
			if (headPointer < A.length && !set.contains(A[headPointer]) && A[headPointer] <= M) {
				set.add(A[headPointer]);
				headPointer++;
				counter += set.size();

				if (counter >= ONE_BILLION) {
					return ONE_BILLION;
				}
			} else {
				set.remove(A[tailPointer]);
				tailPointer++;
			}
		}

		return counter;
	}

	public int solutionStillONSquare(int M, int[] A) {
		final int ONE_BILLION = 1_000_000_000;
		int headPointer = 0;
		int tailPointer = 0;
		int counter = 0;
		Set<Integer> set = new HashSet<>();
		while (headPointer < A.length || tailPointer < A.length) {
			if (!set.contains(A[headPointer]) && A[headPointer] <= M) {
				set.add(A[headPointer]);
				if (set.size() >= ONE_BILLION) {
					return ONE_BILLION;
				}
				if (headPointer < A.length - 1) {
					headPointer++;
				}
				counter++;
			} else {
				tailPointer++;
				headPointer = tailPointer;
				set.clear();
			}
		}

		return counter;
	}

	public int solutionONSquare(int M, int[] A) {
		final int ONE_BILLION = 1_000_000_000;
		int count = 0;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= M) {
				HERE: for (int j = i; j < A.length; j++) {
					if (A[j] <= M) {
						if (!set.contains(A[j])) {
							set.add(A[j]);
							count++;
						} else {
							break HERE;
						}
						if (count >= ONE_BILLION) {
							return ONE_BILLION;
						}
					}
				}
			}
			set.clear();
		}

		return count;
	}
}

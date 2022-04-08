package com.kodcha.a02.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class OddOccurrencesInArray {

	@Test
	void test() {
		assertEquals(7, this.solution(new int[] { 9, 3, 9, 3, 9, 7, 9 }));
	}

	public int solution(int[] A) {

		if (A.length == 0 || A.length % 2 == 0) {
			throw new RuntimeException("this should not happen");
		}

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			if (set.contains(A[i])) {
				set.remove(Integer.valueOf(A[i]));
			} else {
				set.add(A[i]);
			}
		}

		return (int) set.toArray()[0];
	}

}

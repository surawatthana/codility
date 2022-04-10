package com.kodcha.a04.countingElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class MyFrogRiverOne {

	@Test
	void test() {
		assertEquals(6, new MyFrogRiverOne().solution(5, new int[] { 1, 3, 1, 4, 2, 3, 5, 4 }));
	}

	public int solution(int X, int[] A) {

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < A.length; i++) {
			int step = A[i];
			if (!set.contains(step)) {
				set.add(step);
			}

			if (set.contains(1) && set.contains(X) && set.size() == X) {
				return i;
			}
		}

		return -1;
	}

}

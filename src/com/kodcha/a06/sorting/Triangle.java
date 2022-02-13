package com.kodcha.a06.sorting;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class Triangle {

	@Test
	void test() {
		assertTrue(this.solution(new int[] { 10, 2, 5, 1, 8, 20 }) == 1);
	}

	public int solution(int[] A) {

		if (A.length < 3)
			return 0;

		List<Integer> ints = new ArrayList<>();

		for (int i = 0; i < A.length; i++) {
			ints.add(A[i]);
		}

		Collections.sort(ints);
		
		long[] longs = new long[ints.size()];
		
		for (int i = 0; i<ints.size(); i++) {
			longs[i] = ints.get(i);
		}
		

		for (int i = 0; i < longs.length; i++) {
			long p, q, r;

			if (i + 2 > longs.length - 1) {
				break;
			}

			p = longs[i];
			q = longs[i + 1];
			r = longs[i + 2];

			if (p + q > r && q + r > p && r + p > q) {
				return 1;
			}
		}

		return 0;
	}

	public int thePerfectSolution(int[] A) {
		if (A.length < 3)
			return 0;

		List<Integer> aList = new ArrayList();
		for (int i = 0; i < A.length; i++) {
			aList.add(A[i]);
		}
		Collections.sort(aList); // made long array because each int element can be as high as Integer.MAX_VALUE
									// so when add them can overflow int
		long[] aOrdered = new long[A.length];
		int index = 0;
		for (Integer i : aList) {
			aOrdered[index++] = i;
		}
		// start from
		// the end (largest) //if previous 2 elements have sum > current element, found
		// a triangle
		for (int i = aOrdered.length - 1; i >= 2; i--) {
			if (aOrdered[i - 1] + aOrdered[i - 2] > aOrdered[i]) {
				return 1;
			}
		}
		return 0;
	}

}

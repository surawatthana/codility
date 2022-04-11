package com.kodcha.a04.countingElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MyPermCheck {

	@Test
	void test1() {
		assertEquals(1, new MyPermCheck().solution(new int[] { 4, 1, 3, 2 }));
	}

	@Test
	void test2() {
		assertEquals(0, new MyPermCheck().solution(new int[] { 4, 1, 3 }));
	}

	public int solution(int[] A) {
		
		// O(log N) 
		Arrays.sort(A);
		
		// check if it is really a permutation
		if (A[0] == 1 && A[A.length -1] == A.length) {
			// check if all elements are consecutive. O(N)
			for (int i = 0; i< A.length - 1; i++) {
				int j = i+1;
				
				if (A[i] + 1 != A[j] ) {
					return 0;
				}
			}
			return 1;
		} else {
			return 0;
		}
	}
}

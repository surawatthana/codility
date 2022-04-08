package com.kodcha.a16.greedyAlgorithm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TieRopes {

	@Test
	void test() {
		assertEquals(3, this.solution(4, new int[] { 1, 2, 3, 4, 1, 1, 3 }));
		assertEquals(1, this.solution(2, new int[] {1,2}));
	}

	public int solution(int K, int[] A) {
		if (A == null || A.length == 0) {
			return 0;
		}

		if (A.length == 1) {
			if (A[0] >= K) {
				return 1;
			} else {
				return 0;
			}
		}

		int count = 0;
		int length = 0;
		 
		for (int rope : A) {
			length += rope;
			
			if(length >= K) {
				count++;
				length = 0;
			}
		}

		return count;

	}
}

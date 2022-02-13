package com.kodcha.a05.prefixsum;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class CountDiv {

	@Test
	void test() {
		assertEquals(3, this.perfectSolution(6, 11, 2));
		assertEquals(3, this.solution(0, 11, 5));
		assertEquals(1, this.solution(0, 11, 12));
		assertEquals(0, this.solution(1, 11, 12));
		assertEquals(1, this.solution(0, 0, 12));
		assertEquals(8, this.solution(11, 33, 3));

		assertEquals(1, this.solution(10, 10, 5));
		assertEquals(0, this.solution(10, 10, 7));
		assertEquals(0, this.solution(10, 10, 20));

		assertEquals(1, this.solution(33, 33, 33));
		assertEquals(901, this.solution(100000, 1000000, 1000));
		assertEquals(901, this.solution(1000, 10000, 10));
		assertEquals(901, this.solution(100, 1000, 1));
		assertEquals(2, this.solution(0, 2000000000, 2000000000));
		assertEquals(1, this.solution(2000000000, 2000000000, 2000000000));

		assertEquals(61499951, this.solution(100, 123000000, 2));
		assertEquals(12300, this.solution(101, 123000000, 10000));
	}

	public int solution(int A, int B, int K) { // 50%
		int numDivisibles = 0;

		// nothing to do when K > B
		if (K > B) {
			if (A == 0 || B == 0) {
				return 1; // K mod 0 == 0 so count a single divisor
			}
			return 0; // no divisors when A, B both != 0
		}

		for (int i = 0; i < B - A + 1; i++) {
			if ((A + i) % K == 0) {
				numDivisibles++;
			}
		}

		return numDivisibles;
	}
//	public int solution(int A, int B, int K) { // 50%
//		return (int) IntStream.rangeClosed(A, B).parallel().filter(i -> i %K ==0).count();
//	}

	public int perfectSolution(int A, int B, int K) {
		int divisors = 0;

		// nothing to do when K > B
		if (K > B) {
			if (A == 0 || B == 0) {
				return 1; // K mod 0 == 0 so count a single divisor
			}
			return 0; // no divisors when A, B both != 0
		}

		if (A == 0) {
			divisors++; // K mod 0 == 0
		}

		int updatedA = A;
		if (K > A) {
			updatedA = K; // skip checking all values < K
		}

		int firstNonZeroDivisor = 0;
		int lastNonZeroDivisor = 0;

		for (int i = updatedA; i <= B; i++) {
			if (i % K == 0) {
				firstNonZeroDivisor = i;
				break;
			}
		}
		for (int i = B; i >= updatedA; i--) {
			if (i % K == 0) {
				lastNonZeroDivisor = i;
				break;
			}
		}
		if (firstNonZeroDivisor == 0 && lastNonZeroDivisor == 0) {
			divisors = 0;
		} else {
			divisors += ((lastNonZeroDivisor - firstNonZeroDivisor) / K) + 1;
		}

		return divisors;
	}

}

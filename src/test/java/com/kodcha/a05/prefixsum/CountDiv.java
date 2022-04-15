package com.kodcha.a05.prefixsum;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

class CountDiv {

	@Test
	void test() {
		assertEquals(3, this.solution(6, 11, 2));
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
		assertEquals((Integer.MAX_VALUE/2) + 1, this.solution(0, Integer.MAX_VALUE, 2));
	}
	

	public int solution(int A, int B, int K) {
		
		
		int c = B/K - A/K;
		if (A%K == 0) {
			c++;
		}
		return c;
	}


}

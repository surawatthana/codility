package com.kodcha.a04.countingElement;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMissingInteger {

	@Test
	void test() {
		assertEquals(5, new MyMissingInteger().solution(new int[] {1,3,6,4,1,2}));
		assertEquals(4, new MyMissingInteger().solution(new int[] {1,2,3}));
		assertEquals(1, new MyMissingInteger().solution(new int[] {-1,-3}));
	}

	public int solution(int[] A) {
		
		return 0;
	}
}

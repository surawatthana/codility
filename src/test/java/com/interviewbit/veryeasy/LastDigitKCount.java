package com.interviewbit.veryeasy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LastDigitKCount {
	@Test
	void test1() {
		assertEquals(11, new LastDigitKCount().solve(11, 111, 1));
	}

	@Test
	void test2() {
		assertEquals(0, new LastDigitKCount().solve(1, 9, 0));
	}

	@Test
	void test3() {
		assertEquals(27366241, new LastDigitKCount().solve(634703376, 908365783, 8));
	}

	public int solve(int A, int B, int C) {
		
		
		int low = 10 * (int) Math.ceil(A/10.0);
		int high= 10 * (int) Math.floor(B/10.0);
		
		int count = (high - low)/10;
		
		if (B % 10 >= C) {
			count++;
		}
		
		if (A % 10 <= C && (A%10) > 0) {
			count++;
		}
		
		return count;
	}
}

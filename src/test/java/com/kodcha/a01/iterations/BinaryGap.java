package com.kodcha.a01.iterations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryGap {

	@Test
	void test() {
		assertEquals(2, solution(9));
		assertEquals(4, solution(529));
		assertEquals(1, solution(20));
		assertEquals(0, solution(15));
		assertEquals(0, solution(32));
	}

	public int solution(int N) {

		String binaryString = Integer.toBinaryString(N);
		char[] binaryArray = new char[binaryString.length()];

		for (int i = 0; i < binaryString.length(); i++) {
			binaryArray[i] = binaryString.charAt(i);
		}
		
		int maxZeros = 0;
		int zeroCounter = 0;
		boolean startCounting = false;
		for (int i = binaryString.length() - 1; i >= 0; i--) {
			if (binaryArray[i] == '1') {
				startCounting = true;
				maxZeros = Math.max(maxZeros, zeroCounter);
				zeroCounter = 0;
				continue;
			}
			if (startCounting && binaryArray[i] == '0') {
				zeroCounter++;
			}
		}

		return maxZeros;
	}

}

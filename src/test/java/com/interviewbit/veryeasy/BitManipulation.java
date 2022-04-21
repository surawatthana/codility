package com.interviewbit.veryeasy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BitManipulation {

	@Test
	void test1() {
		assertEquals(0, new BitManipulation().solve(7));
	}
	
	@Test
	void test2() {
		assertEquals(2, new BitManipulation().solve(5));
	}
	
	public int solve(int A) {
		
		String binaryString = Integer.toBinaryString(A);
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i =0; i<binaryString.length(); i++) {
			if (Character.valueOf('1').equals(binaryString.charAt(i))) {
				stringBuilder.append("0");
			} else {
				stringBuilder.append("1");
			}
		}
		
		String flippedBinaryString = stringBuilder.toString();
		
		return Integer.parseInt(flippedBinaryString, 2);
    }

}

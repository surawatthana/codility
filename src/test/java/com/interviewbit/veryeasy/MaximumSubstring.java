package com.interviewbit.veryeasy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximumSubstring {

	@Test
	void test1() {
		assertEquals(1, new MaximumSubstring().solve("baab", 2));
	}
	
	@Test
	void test2() {
		assertEquals(1, new MaximumSubstring().solve("bba", 2));
	}
	
	
	public int solve(String A, int B) {
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < A.length(); i = i +B) {
			int end = i + B;
			if ( end > A.length()) {
				end = A.length();
			}
			String subString = A.substring(i, end);
			
			int countA = 0;
			
			for (int j = 0; j< subString.length(); j++) {
				if("a".equals(subString.charAt(j) + "" )) {
					countA++;
				}
			}
			
			max = Math.max(countA, max);
		}
		
		
		return max;
    }

}

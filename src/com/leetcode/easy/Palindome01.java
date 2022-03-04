package com.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Palindome01 {

	@Test
	void test() {
		 assertFalse( new PalindromeSolution().isPalindrome(123));
	}
	
	class PalindromeSolution {
	    public boolean isPalindrome(int x) {
	    	
	    	if (x < 0 || (x != 0 && x % 10 == 0))
	            return false;
	        int reversedNum = 0;
	        while (x > reversedNum) {
	            reversedNum = reversedNum * 10 + x % 10;
	            x = x / 10;
	        }
	        
	        return (x == reversedNum || x == reversedNum / 10);
	    }
	}

}

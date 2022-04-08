package com.leetcode.inplace;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ReverseString {

	@Test
	void test() {
		assertTrue( Arrays.equals(new char[] {'o','l','l','e','h'}, this.reverseString(new char[] {'h','e','l','l','o'}))  );
	}
	
	
	public char[] reverseString(char[] s) {
        int begin = 0;
        int end = s.length-1;
        
        while (begin < end) {
        	char tempStorage ;
        	tempStorage = s[begin];
        	s[begin] = s[end];
        	s[end] = tempStorage;
        	begin++;
        	end--;
        }
        
        return s;
    }
	

}

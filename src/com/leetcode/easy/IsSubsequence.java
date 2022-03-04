package com.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class IsSubsequence {

	@Test
	void test() {
		assertTrue(new Solution().isSubsequence("abc", "ahbgdc"));
		assertFalse(new Solution().isSubsequence("aec", "abcde"));
		assertFalse(new Solution().isSubsequence("axc", "ahbgdc"));
	}

}

class Solution {
	public boolean isSubsequence(String s, String t) {
		
		int i = 0;
		for (int j = 0; j < t.length() && i < s.length(); j++) {
			if (t.charAt(j) == s.charAt(i)) {
				i++;
			}
		}
		
		return i == s.length();
		

 

//        char[] ts = t.toCharArray();
//        char[] ss = s.toCharArray();
//        
//        int currentIndex = 0;
//        int numberOfMatchedCharacters = 0;
//        
//        for(int i = 0; i< ss.length; i++) {
//            INNER:
//            for (int j = currentIndex; j < ts.length; j++) {
//                if(ts[j] == ss[i]) {
//                    currentIndex = ++j;
//                    numberOfMatchedCharacters++;
//                    break INNER;
//                }
//            }
//        }
//        
//        
//        
//        return numberOfMatchedCharacters == s.length() ;
	}
}

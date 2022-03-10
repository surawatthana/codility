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
	}
}

package algoexpert.string.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeCheck {

	@Test
	void test() {
		assertTrue(PalindromeCheck.isPalindrome("abcdcba"));
	}

	
	public static boolean isPalindrome(String str) {
		
		if (str.length() ==1 ) {
			return true;
		}
	    
		
		int startIndex = 0;
		int endIndex = str.length() - 1;
		
		while (startIndex < endIndex) {
			if ( str.charAt(startIndex) != str.charAt(endIndex) ) {
				return false;
			}
			
			startIndex++;
			endIndex--;
		}
		
		
		return true;
	}
}

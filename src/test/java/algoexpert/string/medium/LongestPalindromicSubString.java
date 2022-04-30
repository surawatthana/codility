package algoexpert.string.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;
class LongestPalindromicSubString {

	@Test
	void test1() {
		assertEquals("xyzzyx", LongestPalindromicSubString.mySolution("abaxyzzyxf"));
	}
	
	@Test
	void test2() {
		assertEquals("a", LongestPalindromicSubString.mySolution("a"));
	}
	
	@Test
	void test3() {
		assertEquals("noon", LongestPalindromicSubString.mySolution("it's highnoon"));
	}
	
	public static String mySolution(String str) {
	    
		// populate the map
		Map<Character, Integer[]> map = new HashMap<>();
	    for(int i = 0; i<str.length(); i++) {
	    	Character character = str.charAt(i);
	    	
	    	if (map.get(character) == null) {
	    		map.put(character, new Integer[] {i,i});
	    	} else {
	    		Integer[] range = map.get(character);
	    		range[1] = i;
	    		map.put(character, range);
	    	}
	    }
	    
	    // identify the longest range
	    String longestPalindromicSubString = "";
	    
	    for (Map.Entry<Character, Integer[]> entry : map.entrySet()) {
	    	String subString = str.substring(entry.getValue()[0] +entry.getValue()[1] + 1);
	    	
	    	boolean isPalindromic = true;
	    	int i = 0;
	    	while (i < subString.length() / 2) {
	    		char beginChar = subString.charAt(i);
	    		char endChar   = subString.charAt(subString.length() - i - 1);
	    		
	    		if (beginChar != endChar) {
	    			isPalindromic = false;
	    			break;
	    		}
	    	}
	    	
	    	if (isPalindromic) {
	    		int lengthCurrentPalindromicSubString = longestPalindromicSubString.length();
	    		int lengthNewPalindromicSubString =  subString.length();
	    		if ( lengthNewPalindromicSubString > lengthCurrentPalindromicSubString ) {
	    			longestPalindromicSubString = subString;
	    		}
	    	}
	    }
	    
	    return longestPalindromicSubString;
	  }

}

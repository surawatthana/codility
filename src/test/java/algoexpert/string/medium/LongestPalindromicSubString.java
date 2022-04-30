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
		
		if (str.length() == 1) {
			return str;
		}

		String palindromicString = "";

		for (int i = 0; i < str.length(); i++) {
			char charStart = str.charAt(i);

			for (int j = i + 1; j < str.length(); j++) {
				char charEnd = str.charAt(j);
				if (charStart == charEnd) {
					String subString = str.substring(i, j + 1);
					if (isPalindromicString(subString)) {
						if (subString.length() > palindromicString.length()) {
							palindromicString = subString;
						}
					}
				}
			}
		}
		return palindromicString;
	}

	private static boolean isPalindromicString(String subString) {

		int i = 0;
		while (i < subString.length() / 2) {
			char beginChar = subString.charAt(i);
			char endChar = subString.charAt(subString.length() - i - 1);

			if (beginChar != endChar) {
				return false;
			}
			i++;
		}
		return true;

	}

}

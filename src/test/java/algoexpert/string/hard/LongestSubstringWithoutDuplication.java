package algoexpert.string.hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;

class LongestSubstringWithoutDuplication {

	@Test
	void test1() {
		assertEquals("mentisac", LongestSubstringWithoutDuplication.solution("clementisacap"));
	}

//	@Test
//	void test2() {
//		assertEquals("a", LongestSubstringWithoutDuplication.solution("a"));
//	}

	public static String mySolution(String str) {
		String longestSubstring = "";
		for (int i = 0; i < str.length(); i++) {
			String candidate = "";
			for (int j = i; j < str.length(); j++) {
				if (!candidate.contains("" + str.charAt(j))) {
					candidate = candidate + str.charAt(j);
				} else {
					if (candidate.length() > longestSubstring.length()) {
						longestSubstring = candidate;
					}
					break;
				}
				
				if ( j == str.length() -1 && (candidate.length() > longestSubstring.length())) {
					longestSubstring = candidate;
				}
			}
		}

		return longestSubstring;
	}
	
	public static String solution(String str) {
//		Map<Character, Integer> lastSeen = new HashMap<>();
//		int[] longest = {0, 1};
//		int startIndex = 0;
//		for (int i = 0; i < str.length(); i++) {
//			char character = str.charAt(i);
//			if (lastSeen.containsKey(character)) {
//				startIndex = Math.max(startIndex, lastSeen.get(character) + 1);
//			}
//			if (longest[1] - longest[0] < i +1 - startIndex) {
//				longest = new int[] {startIndex, i+1};
//			}
//			lastSeen.put(character, i);
//		}
//		
//		return str.substring(longest[0], longest[1]);
		
		return "";
	}
}

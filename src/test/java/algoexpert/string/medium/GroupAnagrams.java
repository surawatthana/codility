package algoexpert.string.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;
class GroupAnagrams {

	@Test
	void test() {
		
		List<List<String>> expected = new ArrayList<>();
		
		expected.add(Arrays.asList("yo", "oy"));
		expected.add(Arrays.asList("act", "tac", "cat"));
		expected.add(Arrays.asList("flop", "olfp"));
		
		expected.add(Arrays.asList("foo"));
		
		assertEquals(expected, GroupAnagrams.mySolution(Arrays.asList("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp")));
	}
	
	public static List<List<String>> mySolution(List<String> words) {
		
		
		if (words == null || words.isEmpty()) {
			return new ArrayList<>();
		}
		
		if (words.size() == 1) {
			return Arrays.asList( Arrays.asList(words.get(0)));
		}
		
		List<String> cloned = new ArrayList<>(words);
		List<List<String>> result = new ArrayList<>();
		
		for (int i = 0; i < words.size(); i++) {
			String base = words.get(i);
			List<String> list = new ArrayList<>();
			for (int j = i+1; j < words.size(); j++) {
				String candidate = words.get(j);
				if (isAnagram(candidate, base)) {
					
					if (cloned.contains(base)) {
						list.add(base);
					}
					if (cloned.contains(candidate)) {
						list.add(candidate);
					}
					cloned.remove(base);
					cloned.remove(candidate);
				}
			}
			
			if (!list.isEmpty()) {
				List<String> myWords = new ArrayList<>();
				for(String word: list) {
					myWords.add(word);
				}
				
				result.add(myWords);
			}
			
			list.clear();
		}
		
		if (!cloned.isEmpty()) {
			for (String word: cloned) {
				List<String> remainingWord = new ArrayList<>();
				remainingWord.add(word);
				result.add(remainingWord);
			}
		}
		
	    return result;
	  }
	
	
	private static boolean isAnagram(String a, String b) {
		
		if ((a == null && b != null) || (a != null && b == null)) {
			return false;
		}
		
		if (a.length() != b.length()) {
			return false;
		}
		
		char[] aArray = a.toCharArray();
		char[] bArray = b.toCharArray();
		Arrays.sort(aArray);
		Arrays.sort(bArray);
		
		return Arrays.equals(aArray, bArray);
	}
}

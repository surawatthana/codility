package algoexpert.string.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.*;
class NeverseWordsInString {

	@Test
	void test1() {
		assertEquals("best! the is AlgoExpert", new NeverseWordsInString().mySolution("AlgoExpert is the best!"));
	}
	
	@Test
	void test2() {
		assertEquals("a ab a", new NeverseWordsInString().mySolution("a ab a"));
	}
	
	final char SPACE = ' ';
	
	public String mySolution(String string) {
		
		if(string.length() == 1) {
			return string;
		}
	    
		List<String> list = new ArrayList<>();
		int beginIndex = 0;
		for (int i = 1; i<string.length(); i++) {
			if (isSpace(string.charAt(i - 1)) != isSpace(string.charAt(i))) {
				list.add(string.substring(beginIndex, i));
				beginIndex = i;
			}
			
			if (i == string.length() - 1) {
				list.add(string.substring(beginIndex, i + 1));
			}
		}
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = list.size() -1; i >= 0; i--) {
			stringBuilder.append(list.get(i));
		}
		
	    return stringBuilder.toString();
	}
	
	private boolean isSpace(char character) {
		return SPACE == character;
		
	}
}

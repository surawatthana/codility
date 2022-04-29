package algoexpert.string.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.*;

class RunLengthEncoding {

	@Test
	void test() {
		assertEquals("9A4A2B4C2D", RunLengthEncoding.solution1("AAAAAAAAAAAAABBCCCCDD"));
	}

	public static String mySolution(String string) {
		StringBuilder stringBuilder = new StringBuilder();
		List<Character> characters = new ArrayList<>();
		List<Integer> characterCounts = new ArrayList<>();

		characters.add(string.charAt(0));
		characterCounts.add(1);

		int listIndex = 0;

		for (int i = 1; i < string.length(); i++) {

			if (string.charAt(i) == characters.get(listIndex)) {
				characterCounts.set(listIndex, characterCounts.get(listIndex) + 1);
			} else {
				listIndex++;
				characters.add(string.charAt(i));
				characterCounts.add(1);
			}
		}

		for (int i = 0; i < characters.size(); i++) {

			int count = characterCounts.get(i);
			Character character = characters.get(i);

			if (count < 10) {
				stringBuilder.append("" + count + character);
			} else {
				while (count > 0) {
					if (count > 9) {
						stringBuilder.append("" + 9 + character);
						count -= 9;
					} else {
						stringBuilder.append("" + count + character);
						count -= 9;
					}
				}
			}

		}

		return stringBuilder.toString();
	}
	
	public static String solution1(String string) {
		StringBuilder stringBuilder = new StringBuilder();
		int currentRunLength = 1;
		
		for (int i=1; i <string.length(); i++) {
			char currentChar = string.charAt(i);
			char previousChar= string.charAt(i-1);
			
			if ((currentChar != previousChar) || currentRunLength == 9) {
				stringBuilder.append(Integer.toString(currentRunLength));
				stringBuilder.append(previousChar);
				currentRunLength = 0;
			}
			
			currentRunLength += 1;
		}
		
		// handle last item
		stringBuilder.append(Integer.toString(currentRunLength));
		stringBuilder.append(string.charAt(string.length() - 1));
		
		return stringBuilder.toString();
	}

}

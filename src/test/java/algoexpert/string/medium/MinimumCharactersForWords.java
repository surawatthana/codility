package algoexpert.string.medium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class MinimumCharactersForWords {

	@Test
	void test() {

		assertTrue(Arrays.equals(new char[] { 't', 't', 'h', 'i', 's', 'a', 'd', 'd', 'e', 'e', 'm', '!' },
				new MinimumCharactersForWords()
						.mySolution(new String[] { "this", "that", "did", "deed", "them!", "a" })));

	}

	public char[] mySolution(String[] words) {

		List<Character> characters = new ArrayList<>();

		for (int i = 0; i < words.length; i++) {

			List<Character> clone = new ArrayList<>(characters);

			String word = words[i];

			for (Character character : word.toCharArray()) {
				if (clone.contains(character)) {
					clone.remove(character);
				} else {
					characters.add(character);
				}
			}
		}

		char[] result = new char[characters.size()];

		for (int i = 0; i < characters.size(); i++) {
			result[i] = characters.get(i);
		}

		return result;
	}

}

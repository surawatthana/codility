package algoexpert.string.easy;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import org.junit.jupiter.api.Test;

class FirstNonRepeatingCharacter {

	@Test
	void test() {
		assertEquals(1, new FirstNonRepeatingCharacter().mySolution("abcdcaf"));
	}

	public int mySolution(String string) {

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < string.length(); i++) {
			if (!map.containsKey(string.charAt(i))) {
				map.put(string.charAt(i), 1);
			} else {
				map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
			}
		}

		for (int i = 0; i < string.length(); i++) {
			if (map.get(string.charAt(i)) == 1) {
				return i;
			}
		}

		return -1;
	}

}

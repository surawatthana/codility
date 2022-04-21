package com.interviewbit.veryeasy;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;

class FrequencyOfCharacters {

	@Test
	void test1() {
		assertTrue(Arrays.equals(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				new FrequencyOfCharacters().solve("abcdefghijklmnopqrstuvwxyz")));
	}

	@Test
	void test2() {
		assertTrue(Arrays.equals(new int[] { 0, 1, 0, 0, 2, 0, 0, 0, 3, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 2, 0, 1, 1, 0, 0, 0 },
				new FrequencyOfCharacters().solve("interviewbit")));
	}
	
	@Test
	void test3() {
		System.out.println(new FrequencyOfCharacters().solve("what is your name"));
	}

	public int[] solve(String A) {

		SortedMap<Character, Integer> characterMap = new TreeMap<>();

		final String A_TO_Z = "abcdefghijklmnopqrstuvwxyz";

		for (int i = 0; i < A_TO_Z.length(); i++) {
			characterMap.put(A_TO_Z.charAt(i), i);
		}

		int[] result = new int[26];

		for (int i = 0; i < result.length; i++) {
			result[i] = 0;
		}

		SortedMap<Character, Integer> map = new TreeMap<>();

		for (int i = 0; i < A.length(); i++) {
			char character = A.charAt(i);
			
			if (characterMap.containsKey(character)) {

				Integer count = map.get(character);
	
				if (count == null) {
					count = 1;
				} else {
					count++;
				}
	
				map.put(character, count);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			result[characterMap.get(entry.getKey())] = entry.getValue();

		}

		return result;
	}

}

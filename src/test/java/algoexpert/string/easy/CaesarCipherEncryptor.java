package algoexpert.string.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarCipherEncryptor {

	@Test
	void test1() {
		assertEquals("zab", CaesarCipherEncryptor.caesarCypherEncryptor("xyz", 2));
	}

	@Test
	void test2() {
		assertEquals("ovmqkwtujqmfkao", CaesarCipherEncryptor.caesarCypherEncryptor("ovmqkwtujqmfkao", 52));
	}
	
	@Test
	void test3() {
		assertEquals("fgh", CaesarCipherEncryptor.caesarCypherEncryptor("abc", 57));
	}

	public static String caesarCypherEncryptor(String str, int key) {
		if (key % 26 == 0) {
			return str;
		}
		
		if (key % 26 > 0) {
			key = key % 26;
		}

		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			int value = (str.charAt(i) + key);
			if (value > 122) {
				value = value - (int) 'z' + (int) 'a' - 1;
			}

			stringBuilder.append((char) value);
		}

		return stringBuilder.toString();
	}

}

package algoexpert.string.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;

class GenerateDocument {

	@Test
	void test() {
		assertTrue(new GenerateDocument().generateDocument("Bste!hetsi ogEAxpelrt x ", "AlgoExpert is the Best!"));
	}

	public boolean generateDocument(String characters, String document) {
		
		List<String> documentCharacters = new ArrayList<>();

		for (int i = 0; i < characters.length(); i++) {
			documentCharacters.add(String.valueOf(characters.charAt(i)));
		}

		for (int i = 0; i < document.length(); i++) {
			String character = String.valueOf(document.charAt(i));

			if (!documentCharacters.contains(character)) {
				return false;
			}

			documentCharacters.remove(character);
		}

		return true;
	}

}

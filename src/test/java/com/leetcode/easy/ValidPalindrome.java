package com.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidPalindrome {

	@Test
	void test() {
		assertFalse(this.isValidPalindrome("race a car"));
		assertTrue(this.isValidPalindrome(" "));
		assertTrue(this.isValidPalindrome("A man, a plan, a canal: Panama"));
	}

	public boolean isValidPalindrome(String s) {

		if (s == null || s.trim().isEmpty()) {
			return true;
		}

		int head = 0, tail = s.length() - 1;

		while (head <= tail) {
			char headChar = s.charAt(head);
			char tailChar = s.charAt(tail);
			
			if (!isAlphaNumericChar(headChar)) {
				head++;
			} else if (!isAlphaNumericChar(tailChar)) {
				tail--;
			} else {
				if (this.toLower(headChar) != this.toLower(tailChar)) {
					return false;
				}
				head++;
				tail--;
			}
		}
		return true;
	}

	private boolean isAlphaNumericChar(char c) {

		return c == 'a' || c == 'b' || c == 'c' || c == 'd' || c == 'e' || c == 'f' || c == 'g' || c == 'h' || c == 'i'
				|| c == 'j' || c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'o' || c == 'p' || c == 'q'
				|| c == 'r' || c == 's' || c == 't' || c == 'u' || c == 'v' || c == 'w' || c == 'x' || c == 'y'
				|| c == 'z' || c == 'A' || c == 'B' || c == 'C' || c == 'D' || c == 'E' || c == 'F' || c == 'G'
				|| c == 'H' || c == 'I' || c == 'J' || c == 'K' || c == 'L' || c == 'M' || c == 'N' || c == 'O'
				|| c == 'P' || c == 'Q' || c == 'R' || c == 'S' || c == 'T' || c == 'U' || c == 'V' || c == 'W'
				|| c == 'X' || c == 'Y' || c == 'Z' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5'
				|| c == '6' || c == '7' || c == '8' || c == '9' || c == '0';

	}
	
	private char toLower(char c) {
		
		if (c == 'A') return 'a';
		if (c == 'B') return 'b';
		if (c == 'C') return 'c';
		if (c == 'D') return 'd';
		if (c == 'E') return 'e';
		if (c == 'F') return 'f';
		if (c == 'G') return 'g';
		if (c == 'H') return 'h';
		if (c == 'I') return 'i';
		if (c == 'J') return 'j';
		if (c == 'K') return 'k';
		if (c == 'L') return 'l';
		if (c == 'M') return 'm';
		if (c == 'N') return 'n';
		if (c == 'O') return 'o';
		if (c == 'P') return 'p';
		if (c == 'Q') return 'q';
		if (c == 'R') return 'r';
		if (c == 'S') return 's';
		if (c == 'T') return 't';
		if (c == 'U') return 'u';
		if (c == 'V') return 'v';
		if (c == 'W') return 'w';
		if (c == 'X') return 'x';
		if (c == 'Y') return 'y';
		if (c == 'Z') return 'z';
		
		return c;
	}

}

package com.kodcha.a07.stackAndQueue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.jupiter.api.Test;

class Brackets {

	@Test
	void test() {
		assertTrue(this.solution("{[()()]}") == 1);
	}

	public int solution(String S) {
		if (S.length() % 2 != 0) {
			return 0;
		}

		Stack<String> stack = new Stack<>();

		for (int i = 0; i < S.length(); i++) {
			String character = S.substring(i, i + 1);

			if (isOpeningParenthesis(character)) {
				stack.push(character);
			} else {

				if (stack.size() == 0) {
					return 0;
				}

				if (isMatchedParenthesis(stack.pop(), character)) {
					continue;
				} else {
					return 0;
				}

			}
		}

		if (stack.isEmpty()) {
			return 1;
		}

		return 0;
	}

	private boolean isOpeningParenthesis(String s) {
		return s.equals("{") || s.equals("[") || s.equals("(");
	}
 

	private boolean isMatchedParenthesis(String openParenthesis, String closeParenthesis) {
		if (openParenthesis.equals("{") && closeParenthesis.equals("}")) {
			return true;
		} else if (openParenthesis.equals("[") && closeParenthesis.equals("]")) {
			return true;
		} else if (openParenthesis.equals("(") && closeParenthesis.equals(")")) {
			return true;
		}
		return false;
	}

}

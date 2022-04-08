package com.kodcha.a07.stackAndQueue;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.jupiter.api.Test;

class Nesting {

	@Test
	void test() {
		
		assertEquals(this.solution("()()"),  1);
		
		assertEquals(this.solution("((()(()))())"),  1);
		assertEquals(this.solution("()"),  1);
		assertEquals(this.solution("((()))"),  1);
		assertEquals(this.solution("((()())())"),  1);
		assertEquals(this.solution("))"),  0);
		assertEquals(this.solution(""),  1);
		assertEquals(this.solution("(((("),  0);
		assertEquals(this.solution("))"),  0);
	}
	
	public int solution(String S) {
		if ( S.length() % 2 != 0 ) {
			return 0;
		}
		
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i<S.length(); i++) {
			
			Character c = S.charAt(i);
		
			if (isOpeningParenthesis(c)) {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return 0;
				}
				
				if (isMatchedParenthesis(stack.peek(), c)) {
					stack.pop();
				} else {
					return 0;
				}
			}
		}
		
		if ( stack.isEmpty()) {
			return 1;
		}
		
		return 0;
	}
	
	private boolean isOpeningParenthesis(Character c) {
		return c.equals('(');
	}
 

	private boolean isMatchedParenthesis(Character openParenthesis, Character closeParenthesis) {
		 return openParenthesis.equals('(') && closeParenthesis.equals(')') ;
	}

}

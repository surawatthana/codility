package com.kodcha.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ConsecutiveLetters {

	@Test
	void test() {
//		assertEquals("aabb", this.solution("a?bb"));//aabb
//		assertEquals("baabb", this.solution("??abb")); //ababb, bbabb, baabb
//		assertEquals("aabbaa", this.solution("a?b?aa")); //aabbaa
//		assertEquals("aabbaa", this.solution("aa??aa")); //aabbaa
//		assertEquals("aabbaa", this.solution("aa??a?")); //aabaab
		assertEquals("aabaab", this.solution("aa?a??")); //
	}
	
	public String solution(String S) {
		
		if (S.length() == 1 ) {
			return !"?".equals(S) ? S : "a";
		}
		
		if (S.length() == 2) {
			int i = 0;
			if(S.contains("?")) {
				if (S.contains("a")) {
					return S.replace("?", "b");
				} else if ( S.contains("b")) {
					return S.replace("?", "a");
				} else { // contains ? (again)
					return "ab";
				}
			}
		}
		
		char[] ch = new char[S.length()];
		
		
		List<Integer> questionMarkPositions = new ArrayList<>();		  
        // Copy character by character into array
        for (int i = 0; i < S.length(); i++) {
        	ch[i] = S.charAt(i);
        	if (ch[i] == '?') {
        		questionMarkPositions.add(i);
        	}
        }
        
        // the flow is this way
        // <----------------------------------
        // next(-1), current, previous(+1)
        for (int i = questionMarkPositions.size() -1 ; i >= 0; i--) {
        	Integer currentQuestionMarkPosition = questionMarkPositions.get(i);
        	Integer nextQuestionMarkPosition = i == 0 ? null : questionMarkPositions.get(i-1);
        	
        	// we have a consecutive question marks
        	if ( nextQuestionMarkPosition != null && nextQuestionMarkPosition.equals(currentQuestionMarkPosition - 1) ) {  //consecutive
        		//a??a => a?ba => aa?ba, ba?ba //b??a => b?ba => a?aba, b?aba
        		if ( S.charAt(currentQuestionMarkPosition + 1) == 'a') {
        			ch[i] = 'b';
        			continue;
        		} else if (S.charAt(currentQuestionMarkPosition + 1) == 'b') {
        			ch[i] = 'a';
        			continue;
        		}
        	} else { // non consecutive xa?aa
        		ch[i] = 'a';
        		int countA = 0;
        		int countB = 0;
        		
        		if (currentQuestionMarkPosition == S.length() - 2) {
        			//a?a, a?b, b?a, b?b;
        			int index = S.length() - 2;
        			
        			while (index >= currentQuestionMarkPosition - 2) {
        				
        				if()
        				
        				index++;
        			}
        			
        			
        		} else {
        			
        		}
        		
        		
        		
        		//a?a, a?ab, a?aa
        		//b?b, b?ba, b?bb
        		
        		
        		
        		//a?b, a?bb, a?ba
        		//b?a, b?aa, b?ab
        	}
			
		}
        
        
        return String.valueOf(ch);
	}

}


//if(S.charAt(i) == 'a') {
//	countA++;
//} else if (S.charAt(i) == 'b') {
//	countB++;
//} else { // it is a question mark;
//	if (countA == 2) {
//		ch[i] = 'b';
//		countA = 0;
//		countB = 1;
//	} else if (countB == 2) {
//		ch[i] = 'a';
//		countA = 1;
//		countB = 0;
//	} else if (countA == 1 || countB == 1) {
//		
//		if (i == S.length() - 2) { //  it is question mark at the second place from behind
//			
//			char charAtLastPostionInArray = ch[S.length() -1];
//			char charAtThridPositionFromBehindInString = S.charAt(S.length() - 3);
//			
//			if (charAtLastPostionInArray == charAtThridPositionFromBehindInString) {
//				if (charAtLastPostionInArray == 'a') {// a?a
//					ch[S.length()-2] = 'b';
//					countA = 0;
//            		countB = 1;
//				}else { //b?b
//					ch[S.length()-2] = 'a';
//					countA = 1;
//            		countB = 0;
//				}
//			} else {
//				if(charAtLastPostionInArray == 'a' && charAtThridPositionFromBehindInString == '?') { //??a
//					ch[S.length()-2] = 'a';
//					countA = 1;
//            		countB = 0;
//				} else if (charAtLastPostionInArray == 'b' && charAtThridPositionFromBehindInString == '?') { // ??b
//					ch[S.length()-2] = 'b';
//					countA = 0;
//            		countB = 1;
//				}
//			}
//		} else {
//		
//    		char previousPrevious = ch[i+2];
//    		
//    		if ( previousPrevious == 'a') {
//    			countA++;
//    		} else if (previousPrevious == 'b') {
//    			countB++;
//    		}
//    		
//    		if ( countA == 1 && countB == 1) {
//    			char previous = ch[i+1];
//    			
//    			if (previous == 'a') {
//    				ch[i] = 'a';
//            		countA = 1;
//            		countB = 0;
//    			} else if (previous == 'b') {
//            		ch[i] = 'b';
//            		countA = 0;
//            		countB = 1;
//    			}
//    		}
//    		else if ( countA == 2) {
//    			ch[i] = 'b';
//        		countA = 0;
//        		countB = 1;
//    		} else if (countB == 2) {
//    			ch[i] = 'a';
//        		countA = 1;
//        		countB = 0;
//    		}
//		}
//	}
//	
//	if (i == S.length()-1) { // the very first element is a question mark.
//		char nextElement = S.charAt(i-1);
//		
//		if ( nextElement == 'a' || nextElement == '?') {
//			ch[i] = 'a';
//    		countA = 1;
//    		countB = 0;
//		} else {
//			ch[i] = 'b';
//    		countA = 0;
//    		countB = 1;
//		}
//	}
//}

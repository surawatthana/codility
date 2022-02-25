package com.kodcha.leetcode.a01;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class StringReverse {

	@Test
	void test() {
		this.reverseString(new char[] {'h','e','l','l','o'});
	}
	
	
	public StringBuffer reverseString(String input, StringBuffer stringBuffer) {
		if (input.length() >= 1) {
			stringBuffer.append(input.charAt(input.length()-1));
			input = input.substring(0, input.length()-1);
			reverseString(input, stringBuffer);
		}  
		
		return stringBuffer;
	}
	
	public String normalReverse(String input) {
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = input.length(); i >= 1; i--) {
			stringBuffer.append(input.substring(i - 1, i) );
		}
		return stringBuffer.toString();
	}
	
	public void reverseString(char[] s) {        
//        for (int i = 0; i <  s.length/2; i++){            
//            char c = s[s.length -i - 1];
//            s[s.length -i - 1] = s[i];
//            s[i] = c;
//        }
		
		int p1 = 0;
		int p2 = s.length -1;
		
		while(p1<=p2) {
			char temp = s[p1];
			s[p1] = s[p2];
			s[p2] = temp;
			p1++;
			p2--;
		}
		System.out.println("");
    }

}

package com.kodcha.tests;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class Arrows {

	@Test
	void test() {
		System.out.println(this.solution("^VV<V"));
		System.out.println(this.solution("V>>>VV"));
		System.out.println(this.solution("<<<"));
	}
	
	public int solution(String S) {
		
		Map<String, Integer> map = new HashMap<>();
		
		int stringLength = S.length();
		
		int i = 1;
		while(i < S.length()+1) {
			String subString = S.substring(i-1, i);
			
			if(!map.containsKey(subString)) {
				map.put(subString, 1);
			} else {
				Integer count = map.get(subString) + 1;
				map.put(subString, count);
			}
			i++;
		}
		
		int max = -1;
		
		for(Map.Entry<String, Integer> a : map.entrySet()) {
			max = Math.max(max, a.getValue());
		}
		
		return stringLength - max;
	}

}

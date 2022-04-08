package com.kodcha.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Deletion {

	@Test
	void test() {
		System.out.println(  this.solution("abccbd", new int[] {0,1,2,3,4,5}));
		System.out.println(  this.solution("aabbcc", new int[] {1,2,1,2,1,2}));
		System.out.println(  this.solution("aaaa", new int[] {3,4,5,6}));
		System.out.println(  this.solution("ababa", new int[] {10,5,10,5,10}));
	}
	
	public int solution(String S, int[] C) {
		int n = S.length();
		char curr = '-';
		int max = 0;
		int cost = 0;
		
		for(int i = 0; i < n; i++) {
			if(S.charAt(i) == curr) {
				max = Math.max(max, C[i]);
			} else {
				cost -= max;
				curr = S.charAt(i);
				max = C[i];
			}
			cost += C[i];
		}
		cost -= max;
		return cost;		
	}

}

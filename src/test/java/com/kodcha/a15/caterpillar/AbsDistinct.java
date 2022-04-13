package com.kodcha.a15.caterpillar;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class AbsDistinct {

	@Test
	void test() {
		assertEquals(5, new AbsDistinct().solution(new int[] {-5, -3, -1, 0, 3, 6}));
	}

	public int solution(int[] A) {
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i<A.length; i++) {
			set.add(Math.abs(A[i]));
		}
		
		return set.size();
	}
}

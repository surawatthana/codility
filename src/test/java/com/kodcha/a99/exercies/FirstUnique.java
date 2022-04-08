package com.kodcha.a99.exercies;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class FirstUnique {

	@Test
	void test() {
		assertEquals(5, this.solution(new int[] { 4, 10, 5, 4, 2, 10 }));
		assertEquals(4, this.solution(new int[] { 1, 4, 3, 3, 1, 2 }));
	}

	public int solution(int[] A) {
		if (A.length == 1) {
			return A[0];
		}

		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i : A) {
			Integer count = map.get(Integer.valueOf(i)) == null ? 0 : map.get(Integer.valueOf(i)) ;
			map.put(Integer.valueOf(i), ++count);
		}
		
		for (int i = 0; i < A.length; i++) {
			if (map.get(Integer.valueOf(A[i])) == 1) {
				return A[i];
			}
		}
		
		return -1;
	}

}

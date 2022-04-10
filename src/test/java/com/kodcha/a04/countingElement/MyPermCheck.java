package com.kodcha.a04.countingElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

class MyPermCheck {

	@Test
	void test1() {
		assertEquals(1, new MyPermCheck().solution(new int[] { 4, 1, 3, 2 }));
	}

	@Test
	void test2() {
		assertEquals(0, new MyPermCheck().solution(new int[] { 4, 1, 3 }));
	}

	public int solution(int[] A) {
		
		List<Integer> list = new 

		SortedSet<Integer> set = new TreeSet();

		if (set.first().equals(1) && set.last().equals(A.length) && set.last().equals(set.size())) {
			return 1;
		} else {
			return 0;
		}
	}
}

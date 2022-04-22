package com.interviewbit.veryeasy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class NumbersOfSundays {

	@Test
	void test1() {
		assertEquals(0, new NumbersOfSundays().solve("Monday", 1));
	}
	
	@Test
	void test2() {
		assertEquals(0, new NumbersOfSundays().solve("Tuesday", 1));
	}
	
	@Test
	void test3() {
		assertEquals(0, new NumbersOfSundays().solve("Wednesday", 1));
	}
	
	@Test
	void test4() {
		assertEquals(0, new NumbersOfSundays().solve("Thursday", 1));
	}
	
	@Test
	void test5() {
		assertEquals(0, new NumbersOfSundays().solve("Friday", 1));
	}
	
	@Test
	void test6() {
		assertEquals(0, new NumbersOfSundays().solve("Saturday", 1));
	}
	
	@Test
	void test7() {
		assertEquals(1, new NumbersOfSundays().solve("Sunday", 1));
	}
	
	@Test
	void test8() {
		assertEquals(1, new NumbersOfSundays().solve("Saturday", 2));
	}

	@Test
	void test20() {
		assertEquals(2, new NumbersOfSundays().solve("Monday", 14));
	}
	
	@Test
	void test21() {
		assertEquals(1, new NumbersOfSundays().solve("Monday", 11));
	}

	public int solve(String A, int B) {

		Map<String, Integer> map = new HashMap<>();

		map.put("Monday", 1);
		map.put("Tuesday", 2);
		map.put("Wednesday", 3);
		map.put("Thursday", 4);
		map.put("Friday", 5);
		map.put("Saturday", 6);
		map.put("Sunday", 7);

		int start = map.get(A);
		int end = start + B - 1 ;
		int count  = end / 7;
		
		return count;
	}

}

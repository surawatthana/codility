package com.kodcha.a04.countingElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

class MyMissingInteger {

	@Test
	void test01() {
		assertEquals(5, new MyMissingInteger().solution(new int[] { 1, 3, 6, 4, 1, 2 }));
	}

	@Test
	void test02() {
		assertEquals(4, new MyMissingInteger().solution(new int[] { 1, 2, 3 }));
	}

	@Test
	void test03() {
		assertEquals(1, new MyMissingInteger().solution(new int[] { -1, -3 }));
	}

	@Test
	void test04() {
		assertEquals(1, new MyMissingInteger().solution(new int[] { -1 }));
	}

	@Test
	void test05() {
		assertEquals(2, new MyMissingInteger().solution(new int[] { 1 }));
	}

	@Test
	void test06() {
		assertEquals(1, new MyMissingInteger().solution(new int[] { 0 }));
	}

	@Test
	void test07() {
		assertEquals(1, new MyMissingInteger().solution(new int[] { 3 }));
	}

	@Test
	void test08() {
		assertEquals(1, new MyMissingInteger().solution(new int[] { 2, 3, 4, 6 }));
	}

	@Test
	void test09() {
		assertEquals(6,
				new MyMissingInteger().solution(new int[] { Integer.MIN_VALUE, 1, 2, 3, 4, 5, 9, Integer.MAX_VALUE }));
	}

	@Test
	void test10() {
		assertEquals(1, new MyMissingInteger().solution(new int[] { -1000000, 1000000 }));
	}

	public int solution(int[] A) {

return 0;
	}
}

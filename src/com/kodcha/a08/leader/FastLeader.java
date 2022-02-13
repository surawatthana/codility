package com.kodcha.a08.leader;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class FastLeader {

	@Test
	void test() {
		assertEquals(6, new FastLeader().solution(new int[] { 6, 8, 4, 6, 8, 6, 6, 6, 8, 4, 6, 8, 6, 6, 6, 8, 4, 6, 8, 6, 6, 6, 8, 4, 6, 8, 6, 6, 6, 8, 4, 6, 8, 6, 6, 6, 8, 4, 6, 8, 6, 6, 6, 8, 4, 6, 8, 6, 6, 6, 8, 4, 6, 8, 6, 6, 6, 8, 4, 6, 8, 6, 6, 6, 8, 4, 6, 8, 6, 6, 6, 8, 4, 6, 8, 6, 6, 6, 8, 4, 6, 8, 6, 6 })); 
		assertEquals(6, new GoldenLeader().solution(new int[] { 6, 8, 4, 6, 8, 6, 6, 6, 8, 4, 6, 8, 6, 6, 6, 8, 4, 6, 8, 6, 6, 6, 8, 4, 6, 8, 6, 6, 6, 8, 4, 6, 8, 6, 6, 6, 8, 4, 6, 8, 6, 6, 6, 8, 4, 6, 8, 6, 6, 6, 8, 4, 6, 8, 6, 6, 6, 8, 4, 6, 8, 6, 6, 6, 8, 4, 6, 8, 6, 6, 6, 8, 4, 6, 8, 6, 6, 6, 8, 4, 6, 8, 6, 6 })); 
	}

	public int solution(int[] A) {
		LocalDateTime start = LocalDateTime.now();
		int leader = -1;

		Arrays.sort(A);

		int candidate = A[A.length / 2];

		int count = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] == candidate) {
				count++;
				
				if (count > A.length/2) {
					leader = candidate;
					break;
				}
			}
		}
		System.out.println("fast   nanos: " + Duration.between(start, LocalDateTime.now()).toNanos());
		return leader;
	}

}

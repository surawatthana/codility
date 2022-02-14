package com.kodcha.a10.primeAndCompositeNumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Divisors {

	@Test
	void test() {
		System.out.println(this.solution(24));
	}
	
	public int solution(int N) {
		int i = 1, result = 0;
		
		while (i*i < N) {
			if (N % i == 0) {
				result += 2;
			}
			i++;
		}
		
		if (i*i == N) {
			result++;
		}
		
		return result;
	}

}

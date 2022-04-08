package com.kodcha.a10.primeAndCompositeNumber;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CountFactors {

	@Test
	void test() {
		this.solution(30);
	}

	public int solution(int N) {
		
		List<Integer> allFactors = new ArrayList<>();
		int factors = 0;
		int squareRootN = (int) Math.sqrt(N);
		if (Math.pow(squareRootN, 2) != N) {
			squareRootN++; // round up for any non-perfect squares
		} else { // perfect squares have an additional factor
			factors++;
		}

		for (int i = 1; i < squareRootN; i++) {
			if (N % i == 0) {
				allFactors.add(i);
				factors += 2;
			}
		}

		return factors;
	}

}

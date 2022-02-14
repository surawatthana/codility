package com.kodcha.a11.sieveOfEratosthenes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Factorization {

	@Test
	void test() {
		assertTrue(Arrays.equals(new int[] {2, 2, 5}, this.solution(20)));
	}
	
	public int[] solution(int N) {
		
		List<Integer> factors = new ArrayList<>();
		int[] primeFactors = this.primeFactors(N);
		
		while (N > 1) {
			HERE:
			for (int i = 0; i<primeFactors.length ; i++) {
				if (N % primeFactors[i] == 0) {
					factors.add(primeFactors[i]);
					N = N /primeFactors[i];
					break HERE;
				}
			}
		}
		
		////////////////////////////////////////
 
		int[] result = new int[factors.size()];
		
		for (int i = 0; i<result.length; i++) {
			result[i] = factors.get(i);
		}
		
		return result;
		
	}
	
	private int[] primeFactors(int N) {
		boolean[] primeNumbers = new boolean[N+1];

		for (int i = 0; i <= N; i++) {
			primeNumbers[i] = true;
		}
		
		int i = 2;
		
		while (i * i <= N) {
			if (primeNumbers[i]) {
				int k = i*i;
				while (k <= N) {
					primeNumbers[k] = false;
					k += i;
				}
			}
			i++;
		}
		////////////////////////////////////////
		List<Integer> results = new ArrayList<>();
		for (int j = 2; j < primeNumbers.length; j++) {
			if (primeNumbers[j]) {
				results.add(j);
			}
		}

		int[] primes = new int[results.size()];
		for (int j = 0; j < results.size(); j++) {
			primes[j] = results.get(j);
		}

		return primes;
	}

}

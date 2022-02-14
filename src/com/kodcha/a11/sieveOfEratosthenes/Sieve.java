package com.kodcha.a11.sieveOfEratosthenes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Sieve {

	@Test
	void test() {
		System.out.println(this.solution(17));
	}

	public int[] mysolution(int N) {

		boolean[] primeNumbers = new boolean[N+1];

		for (int i = 0; i <= N; i++) {
			primeNumbers[i] = true;
		}

		for (int i = 2; i <= N; i++) {
			for (int j = i + 1; j <= N; j++) {
				int currentValue = j;

				if (currentValue % i == 0 && primeNumbers[j]) {
					primeNumbers[j] = false;
				}
			}
		}

		List<Integer> results = new ArrayList<>();
		for (int i = 2; i < primeNumbers.length; i++) {
			if (primeNumbers[i]) {
				results.add(i );
			}
		}

		int[] primes = new int[results.size()];
		for (int i = 0; i < results.size(); i++) {
			primes[i] = results.get(i);
		}

		return primes;
	}

	
	public int[] solution(int N) {
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

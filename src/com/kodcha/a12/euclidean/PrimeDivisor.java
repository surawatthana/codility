package com.kodcha.a12.euclidean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

class PrimeDivisor {

	@Test
	void test() {

//		final int SIZE = 6000;
//		final int MIN = 1;
//		final int MAX = Integer.MAX_VALUE;
//		
//		int[] arrayA = new int[SIZE];
//		int[] arrayB = new int[SIZE];
//		
//		for (int i = 0; i < arrayB.length; i++) {
//			arrayA[i] = (int)(Math.random()*(MAX-MIN+1)+MIN);  
//			arrayB[i] = (int)(Math.random()*(MAX-MIN+1)+MIN);  
//		}
		
		int[] arrayA = new int[] { 3};
		int[] arrayB = new int[] { 5};

		
		System.out.println(this.solution(arrayA, arrayB));
	}

//	public int solution(int[] A, int[] B) {
//		int counter = 0;
//		Map<Integer, Set<Integer>> map = new HashMap<>();
//
//		for (int i = 0; i < B.length; i++) {
//			Set<Integer> setA = getSet(A[i], map);
//			Set<Integer> setB = getSet(B[i], map);
//
//			if (!setA.isEmpty() && setA.equals(setB)) {
//				counter++;
//			}
//		}
//
//		return counter;
//	}
//
//	private Set<Integer> getSet(Integer integer, Map<Integer, Set<Integer>> map) {
//		if (map.containsKey(integer)) {
//			return map.get(integer);
//		} else {
//			Set<Integer> set = primeFactorsSet(integer);
//			map.put(integer, set);
//			return set;
//		}
//	}
//
//	public Set<Integer> primeFactorsSet(int N) {
//
//		Set<Integer> factors = new HashSet<>();
//		int[] primeFactors = this.primeFactors(N);
//
//		if (N == 1) {
//			factors.add(1);
//		}
//
//		while (N > 1) {
//			HERE: for (int i = 0; i < primeFactors.length; i++) {
//				if (N % primeFactors[i] == 0) {
//					factors.add(primeFactors[i]);
//					N = N / primeFactors[i];
//					break HERE;
//				}
//			}
//		}
//
//		return factors;
//	}
//
//	private int[] primeFactors(int N) {
//		boolean[] primeNumbers = new boolean[N + 1];
//
//		for (int i = 0; i <= N; i++) {
//			primeNumbers[i] = true;
//		}
//
//		int i = 2;
//
//		while (i * i <= N) {
//			if (primeNumbers[i]) {
//				int k = i * i;
//				while (k <= N) {
//					primeNumbers[k] = false;
//					k += i;
//				}
//			}
//			i++;
//		}
//		////////////////////////////////////////
//		List<Integer> results = new ArrayList<>();
//		for (int j = 2; j < primeNumbers.length; j++) {
//			if (primeNumbers[j]) {
//				results.add(j);
//			}
//		}
//
//		int[] primes = new int[results.size()];
//		for (int j = 0; j < results.size(); j++) {
//			primes[j] = results.get(j);
//		}
//
//		return primes;
//	}
	
	public int solution(int[] A, int[] B) {
        int count = 0;
        for(int i=0; i<A.length; i++) {
            if(samePrimeDiv(A[i], B[i])) {
                count++;
            }
        }
        return count;
    }
    
    public boolean samePrimeDiv(int x, int y) {
        int gcdVal = gcd(x, y);
        int gcdX = 0;
        while(x!=1) {
            gcdX = gcd(x, gcdVal);
            if(gcdX==1) {
                break;
            }
            x /= gcdX;
        }
        if(x!=1) {
            return false;
        }
        int gcdY = 0;
        while(y!=1) {
            gcdY = gcd(y, gcdVal);
            if(gcdY==1) {
                break;
            }
            y /= gcdY;
        }
        return y==1;
    }
    
    public int gcd(int x, int y) {
        if(x%y==0) {
            return y;
        } else {
            return gcd(y, x%y);
        }
    }

}

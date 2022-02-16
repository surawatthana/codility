package com.kodcha.a13.fibonacci;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class Fibonacci {
	
 

	@Test
	void test() {
		
		Map<Integer, Long> map = new HashMap<>();
		map.put(0,0l);
		map.put(1,1l);
		map.put(2,1l);
		
//		System.out.println(this.fibonacci(11));
		System.out.println(this.fibonacciWithDynamicProgramming(31, map));
	}
	
	public int fibonacci(int N) {
		
		if (N == 0) {
			return 0;
		}
		
		if (N ==1 || N == 2) {
			return 1;
		}
		
		return fibonacci(N - 1) + fibonacci( N -2);
	}
	
	public long fibonacciWithDynamicProgramming (int N, Map<Integer, Long> memo) {
		long fibonacciNminus1 = 0;
		if ( memo.get(N - 1) != null) {
			fibonacciNminus1 = memo.get(N -1);
		} else {
			fibonacciNminus1 = fibonacciWithDynamicProgramming(N-1, memo);
			memo.put(Integer.valueOf(N-1), fibonacciNminus1);
		}
		
		long fibonacciNMinus2 = 0;
		if ( memo.get(N - 2) != null) {
			fibonacciNMinus2 = memo.get(N -2);
		} else {
			fibonacciNMinus2 = fibonacciWithDynamicProgramming(N-2, memo);
			memo.put(N-2, fibonacciNMinus2);
		}
		
		
		return fibonacciNminus1 + fibonacciNMinus2;
	}

}

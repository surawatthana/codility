package com.kodcha.a13.fibonacci;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class Fibonacci {
	
	private static Map<Integer, Long> map = new HashMap<>();
	
	static {
		map.put(0,0l);
		map.put(1,1l);
		map.put(2,1l);
	}

	@Test
	void test() {
		

		
//		System.out.println(this.fibonacci(11));
		System.out.println(this.fibonacciWithDynamicProgramming(31));
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
	
	public long fibonacciWithDynamicProgramming (int N) {
		long fibonacciNminus1 = 0;
		
		if ( map.get(N - 1) != null) {
			fibonacciNminus1 = map.get(N -1);
		} else {
			fibonacciNminus1 = fibonacciWithDynamicProgramming(N-1);
			map.put(N-1, fibonacciNminus1);
		}
		
		long fibonacciNMinus2 = 0;
		if ( map.get(N - 2) != null) {
			fibonacciNMinus2 = map.get(N -2);
		} else {
			fibonacciNMinus2 = fibonacciWithDynamicProgramming(N-2);
			map.put(N-2, fibonacciNMinus2);
		}
		
		
		return fibonacciNminus1 + fibonacciNMinus2;
	}

}

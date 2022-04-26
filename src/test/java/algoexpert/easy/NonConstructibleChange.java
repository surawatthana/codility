package algoexpert.easy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class NonConstructibleChange {

	@Test
	void test1() {
		assertEquals(8, new NonConstructibleChange().solve(new int[] {1, 2, 4}));
	}
	
	@Test
	void test2() {
		assertEquals(20, new NonConstructibleChange().solve(new int[] {1, 1, 2, 3, 5, 7, 22}));
	}
	
	@Test
	void test3() {
		assertEquals(4, new NonConstructibleChange().solve(new int[] {1, 2, 5}));
	}
	
	@Test
	void test4() {
		assertEquals(1, new NonConstructibleChange().solve(new int[] {2}));
	}

	
	public int solve(int[] coins) {
		
		int change = 0;

		Arrays.sort(coins);
		
		for (int i = 0; i < coins.length; i++) {
			
			 if (coins[i] > change + 1) {
				 return change +1;
			 }
			 
			 change += coins[i];
			
		}
		 
		return change + 1;
		 
	}

}

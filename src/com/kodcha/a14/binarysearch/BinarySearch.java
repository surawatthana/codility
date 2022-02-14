package com.kodcha.a14.binarysearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearch {

	@Test
	void test() {
		
		System.out.println( this.binarySearch(new int[] {12, 15, 15, 19, 24, 31, 53, 59, 60}, 59));
		
		
	}
	
	public int binarySearch(int[] A, int x) {
		
		int begin = 0;
		int end = A.length-1;
		
		int result = -1;
		
		
		int mid = (end - begin)/2;
		
		
		
		return result;
		
	}
	
	

}

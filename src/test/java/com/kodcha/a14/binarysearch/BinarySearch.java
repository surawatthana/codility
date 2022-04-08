package com.kodcha.a14.binarysearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearch {

	@Test
	void test() {
		//                                                0,  1,  2,  3,  4,  5,  6,  7,  8
//		System.out.println( this.binarySearch(new int[] {12, 15, 15, 19, 24, 31, 53, 59, 60}, 59));
		assertEquals(this.binarySearch(new int[] {12, 15, 15, 19, 24, 31, 53, 59, 60}, 12), 12);
		assertEquals(this.binarySearch(new int[] {12, 15, 15, 19, 24, 31, 53, 59, 60}, 15), 15);
		assertEquals(this.binarySearch(new int[] {12, 15, 15, 19, 24, 31, 53, 59, 60}, 19), 19);
		assertEquals(this.binarySearch(new int[] {12, 15, 15, 19, 24, 31, 53, 59, 60}, 24), 24);
		assertEquals(this.binarySearch(new int[] {12, 15, 15, 19, 24, 31, 53, 59, 60}, 31), 31);
		assertEquals(this.binarySearch(new int[] {12, 15, 15, 19, 24, 31, 53, 59, 60}, 53), 53);
		assertEquals(this.binarySearch(new int[] {12, 15, 15, 19, 24, 31, 53, 59, 60}, 59), 59);
		assertEquals(this.binarySearch(new int[] {12, 15, 15, 19, 24, 31, 53, 59, 60}, 60), 60);
		
		assertEquals(this.binarySearch(new int[] {12, 15, 15, 19, 24, 31, 53, 59, 60}, 13), 12);
		assertEquals(this.binarySearch(new int[] {12, 15, 15, 19, 24, 31, 53, 59, 60}, 16), 15);
		assertEquals(this.binarySearch(new int[] {12, 15, 15, 19, 24, 31, 53, 59, 60}, 20), 19);
		assertEquals(this.binarySearch(new int[] {12, 15, 15, 19, 24, 31, 53, 59, 60}, 25), 24);
		assertEquals(this.binarySearch(new int[] {12, 15, 15, 19, 24, 31, 53, 59, 60}, 32), 31);
		assertEquals(this.binarySearch(new int[] {12, 15, 15, 19, 24, 31, 53, 59, 60}, 54), 53);
		assertEquals(this.binarySearch(new int[] {12, 15, 15, 19, 24, 31, 53, 59, 60}, 62), 60);
		
		
	}
	
	public int binarySearch(int[] A, int x) {
		
		int begin = 0;
		int end = A.length-1;
		
		int result = -1;
		
		while (begin <= end) {
			int mid = (end - begin)/2 + begin;
			if (A[mid] <= x) {
				begin = mid + 1;
				result = A[mid];
			}else {
				end = mid - 1;
			}
		}
		
		
		
		return result;
		
	}
	
	

}

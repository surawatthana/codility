package com.interviewbit.veryeasy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductOfDigits {

	@Test
	void test1() {
		assertEquals(1, new ProductOfDigits().solve(111));
	}
	
	@Test
	void test2() {
		assertEquals(6, new ProductOfDigits().solve(123));
	}
	
	 public int solve(int A) {
		 
		 String string = Integer.valueOf(A).toString();
		 int product = 1;
		 
		 for (int i = 0; i < string.length(); i++) {
			 product *= Integer.valueOf(string.charAt(i) + "");
		 }
		 
		 return product;
	 }

}

package com.kodcha.a06.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class MaxProductOfThree {

	@Test
	void test() {
		System.out.println(  this.solution(new int[] {-3, 1, 2, -2, 5, 6}) == 60);
	}
	
	public int solution(int[] A) {
		
		List<Integer> integers = new ArrayList();
	    for(int i=0; i<A.length; i++) {
	    	integers.add(A[i]);
	    }
		
		Collections.sort(integers);
		
		int product1, product2, product3, product4 ;
		
		product1 = integers.get(0) * integers.get(1) * integers.get(2); //first 3 elements
	    product2 = integers.get(integers.size()-3) * integers.get(integers.size()-2) * integers.get(integers.size()-1); //last 3 elements
	    product3 = integers.get(0) * integers.get(1) * integers.get(integers.size()-1); //first 2 and last element
	    product4 = integers.get(0) * integers.get(integers.size()-2) * integers.get(integers.size()-1); //first and last 2 elements

		
		return Math.max(Math.max(product1, product2), Math.max(product3, product4));
	}
	

}

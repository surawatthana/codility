package com.kodcha.a10.primeAndCompositeNumber;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class MinPerimeterRectangle {

	@Test
	void test() {
		
		System.out.println(this.thePerfectSolution(30));
	}

	public int solution(int N) {
		double minPerimeter = Integer.MAX_VALUE;
		List<Integer> allFactors = new ArrayList<>();
		int squareRootN = (int) Math.sqrt(N);
		if (Math.pow(squareRootN, 2) != N) {
			squareRootN++; // round up for any non-perfect squares
		}  else {
			minPerimeter = 2 * squareRootN * squareRootN;
		}

		for (int i = 1; i < squareRootN; i++) {
			if (N % i == 0) {
				allFactors.add(i);
			}
		}
		
		for (int a : allFactors) {
			int b = N /a;
			minPerimeter = Math.min(minPerimeter, 2 * (a+b));
		}
		
		return (int)minPerimeter;
	}
	
	public int thePerfectSolution(int N) {
		int squareRootN = (int) Math.sqrt(N);

	    int factor2 = 0;
	    int perimeter = 0;
	    int minPerimeter = Integer.MAX_VALUE;
	   
	    if(Math.pow(squareRootN, 2) != N) {
	      squareRootN++; //round up for any non-perfect squares
	    }
	    else { //perfect square root won't be reached inside loop so calculate and set min perimeter
	      minPerimeter = 2 * (squareRootN + squareRootN);
	    }

	    for(int i=1; i<squareRootN; i++) {
	      if(N % i == 0) {
	        //calculate 2nd factor by simple division since know 1st factor and N
	        factor2 = N / i;
	        perimeter = 2 * (factor2 + i);
	        minPerimeter = Math.min(perimeter, minPerimeter);
	      }
	    }
	    return minPerimeter;
	}
}

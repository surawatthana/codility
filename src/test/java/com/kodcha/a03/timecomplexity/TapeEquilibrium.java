package com.kodcha.a03.timecomplexity;

public class TapeEquilibrium {

	public static void main(String[] args) {
		TapeEquilibrium a = new TapeEquilibrium();
		System.out.println(a.solution(new int[] { 3, 1, 2, 4, 3 }) == 1);
		System.out.println(a.solution(new int[] { -3, 1, 2, -4, 3 }) == 1);
		System.out.println(a.solution(new int[] { 5, 2, 7, 10 }) == 4);
		System.out.println(a.solution(new int[] { -1000, 1000, -500, 990 }) == 490);
		System.out.println(a.solution(new int[] { 1, 2 }) == 1);
		System.out.println(a.solution(new int[] { 100, -25 }) == 125);
	}

	public int mySolution(int[] A) {
		int sumAll = 0;
		for (int i = 0; i < A.length; i++) {
			sumAll += A[i];
		}
		
		int minDifference = Integer.MAX_VALUE;
		

		for (int i = 0; i < A.length - 1; i++) {
			int resultLeft = 0;
			int resultRight = 0;

			for (int j = 0; j <= i; j++) {
				resultLeft += A[j];
			}

			resultRight = sumAll - resultLeft;

			int diff = Math.abs(resultLeft - resultRight);
			minDifference = Math.min(minDifference, diff);
		}
		return minDifference;
	}
	
	public int solution(int[] A) {
		int sumAll = 0;
		for (int i = 0; i < A.length; i++) {
			sumAll += A[i];
		}
		
		int minDifference = Integer.MAX_VALUE;
		int currentDifference = 0;
		int resultLeft = 0;
		int resultRight = 0;
		
		for (int i = 0; i < A.length - 1; i++) {
			resultLeft += A[i];
			resultRight = sumAll - resultLeft;
			currentDifference = Math.abs(resultLeft - resultRight);
			minDifference = Math.min(minDifference, currentDifference);
		}
		return minDifference;
	}

}

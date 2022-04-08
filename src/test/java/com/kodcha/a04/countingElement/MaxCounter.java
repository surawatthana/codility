package com.kodcha.a04.countingElement;

import java.util.Arrays;

public class MaxCounter {

	public static void main(String[] args) {
		MaxCounter a = new MaxCounter();
		System.out.println(Arrays.toString(a.mysolution(5, new int[] { 3, 4, 4, 6, 1, 4, 4 })).equals("[3, 2, 2, 4, 2]"));
		System.out.println(Arrays.toString(a.mysolution(2, new int[] { 2, 1, 3, 2, 3, 1, 2 })).equals("[3, 3]"));
	}

	public int[] mysolution(int N, int[] A) {

		int[] returnArray = new int[N];

		int currentNumber = 0;
		for (int i = 0; i < A.length; i++) {
			currentNumber = A[i];

			if (currentNumber > N) {
				int maxCounter = 0;

				for (int j = 0; j < returnArray.length; j++) {
					maxCounter = Math.max(maxCounter, returnArray[j]);
				}

				for (int k = 0; k < returnArray.length; k++) {
					returnArray[k] = maxCounter;
				}

			} else {
				returnArray[currentNumber - 1] = ++returnArray[currentNumber - 1];
			}
		}

		return returnArray;

	}

}

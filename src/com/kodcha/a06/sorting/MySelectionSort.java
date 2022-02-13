package com.kodcha.a06.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MySelectionSort {

	@Test
	void test() {
		assertTrue(Arrays.equals(this.solution(new int[] { 7, 8, 5, 4, 9, 2 }), new int[] { 2, 4, 5, 7, 8, 9 }));
	}

	public int[] solution(int[] intArray) {
		LocalDateTime start = LocalDateTime.now();
		int min;
		int minPosition;
		for (int i = 0; i < intArray.length - 1; i++) {
			minPosition = 0;
			min = intArray[i];

			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[j] < min) {
					min = intArray[j];
					minPosition = j;
				}
			}

			if (min < intArray[i]) {
				swap(i, minPosition, intArray);
			}

		}
		System.out.println("selction sort in nanos: " + Duration.between(start, LocalDateTime.now()).toNanos());
		return intArray;
	}

	public void swap(int a, int b, int[] A) {
		int vA = A[a];
		int vB = A[b];

		A[a] = vB;
		A[b] = vA;
	}

}

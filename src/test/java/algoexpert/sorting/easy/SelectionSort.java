package algoexpert.sorting.easy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SelectionSort {

	@Test
	void test01() {
		assertTrue(Arrays.equals(new int[] { 2, 3, 5, 5, 6, 8, 9 },
				SelectionSort.mySolution(new int[] { 8, 5, 2, 9, 5, 6, 3 })));
	}

	public static int[] mySolution(int[] array) {

		int currentIndex = 0;
		while (currentIndex < array.length - 1) {
			int smallestIndex = currentIndex;
			for (int i = currentIndex + 1; i< array.length; i++) {
				
				// find smallest value
				if (array[smallestIndex] > array[i]) {
					smallestIndex = i;
				}
			}
			
			if (smallestIndex != currentIndex) {
				int temp = array[smallestIndex];
				array[smallestIndex] = array[currentIndex];
				array[currentIndex] = temp;
			}
			
			currentIndex++;
		}
		
		return array;

	}
}

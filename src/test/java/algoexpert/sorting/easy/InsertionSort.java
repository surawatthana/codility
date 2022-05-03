package algoexpert.sorting.easy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class InsertionSort {

	@Test
	void test() {
		assertTrue(Arrays.equals(new int[] { 2, 3, 5, 5, 6, 8, 9 },
				InsertionSort.mySolution(new int[] { 8, 5, 2, 9, 5, 6, 3 })));
	}

	private static int[] mySolution(int[] array) {

		int index = 1;

		while (index < array.length) {
			int counter = index;
			while (counter > 0 && array[counter] < array[counter - 1]) {
				int temp = array[counter];
				array[counter] = array[counter - 1];
				array[counter - 1] = temp;
				counter--;
			}

			index++;
		}

		return array;
	}

}

package algoexpert.sorting.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;

class BubbleSort {

	@Test
	void test01() {
		assertTrue(Arrays.equals(new int[] { 2, 3, 5, 5, 6, 8, 9 },
				BubbleSort.mySolution(new int[] { 8, 5, 2, 9, 5, 6, 3 })));
	}

	public static int[] mySolution(int[] array) {
		
		if (array.length == 0) {
			return new int[] {};
		}
		
		boolean isSorted = false;
		int counter = 0;
		
		while(!isSorted) {
			isSorted = true;
			for (int i = 0; i< array.length - 1 - counter; i++) {
				if (array[i] > array[i+1] ) {
					isSorted = false;
					swap(i, i+1 ,array);
				}
			}
			counter++;
		}
		
		return array;
	}
	
	
	public static int[] solution(int[] array) {
		if (array.length == 0) {
			return new int[] {};
		}
		
		boolean isSorted = false;
		int counter = 0;
		while(!isSorted) {
			isSorted = true;
			for (int i = 0; i < array.length - 1 - counter; i++) {
				if (array[i] > array[i+1]) {
					swap(i, i+1, array);
					isSorted =false;
				}
			}
			counter++;
		}
		return array;
	}

	private static void swap(int i, int j, int[] array) {
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}
}

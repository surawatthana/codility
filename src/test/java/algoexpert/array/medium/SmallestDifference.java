package algoexpert.array.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.*;

class SmallestDifference {

	@Test
	void test() {
		System.out.println(smallestDifference(new int[] { -1, 3, 5, 10, 20, 28 }, new int[] { 15, 17, 26, 134, 135 }));
	}

	public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);

		int pointerA = 0;
		int pointerB = 0;

		int smallestDiff = Integer.MAX_VALUE;
		int[] result = new int[2];

		while (pointerA < arrayOne.length && pointerB < arrayTwo.length) {
			int valueA = arrayOne[pointerA];
			int valueB = arrayTwo[pointerB];

			int diff = Math.abs(valueA - valueB);

			if (diff < smallestDiff) {
				smallestDiff = diff;
				result[0] = valueA;
				result[1] = valueB;
			}

			if (smallestDiff == 0) {
				return result;
			}

			if (valueA < valueB) {
				pointerA++;
			} else if (valueA > valueB) {
				pointerB++;
			}
		}

		return result;
	}

}

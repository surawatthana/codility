package algoexpert.array.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.*;

class LongestPeak {

	@Test
	void test01() {
		assertEquals(6, LongestPeak.solution(new int[] { 1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3 }));
	}

	@Test
	void test03() {
		assertEquals(3, LongestPeak.solution(new int[] { 1, 3, 2 }));
	}

	public static int mySolution(int[] array) {
		// variables
		List<Integer> peaks = new ArrayList<>();
		int maxCount = 0;

		// find all peaks
		for (int i = 1; i < array.length - 1; i++)
			if ((array[i - 1] < array[i]) && (array[i] > array[i + 1]))
				peaks.add(i); // (4, 6)

		// find longest peaks
		for (Integer peak : peaks) {
			int count = 1;

			// counting left
			int leftSide = peak;
			while (true)
				if (leftSide - 1 >= 0 && array[leftSide - 1] < array[leftSide]) {
					count++;
					leftSide--;
				} else {
					break;
				}

			// counting right
			int rightSide = peak;
			while (true)
				if (rightSide + 1 < array.length && array[rightSide] > array[rightSide + 1]) {
					count++;
					rightSide++;
				} else {
					break;
				}

			// get maxCount
			maxCount = Math.max(maxCount, count);
		}

		return maxCount;
	}

	public static int solution(int[] array) {
		int longestPeakLength = 0;
		int i = 1;
		
		while (i < array.length - 1) {
			boolean isPeak = array[i-1] < array[i] && array[i] > array[i+1];
			
			if (!isPeak) {
				i++;
				continue;
			}
			
			int leftIndex = i -2;
			while (leftIndex >= 0 && array[leftIndex] < array[leftIndex + 1]) {
				leftIndex--;
			}
			
			int rightIndex = i+2;
			while (rightIndex < array.length && array[rightIndex] < array[rightIndex -1]) {
				rightIndex++;
			}
			
			int currentPeakLength = rightIndex - leftIndex -1;
			
			longestPeakLength = Math.max(longestPeakLength, currentPeakLength);
			i = rightIndex;
		}
		
		return longestPeakLength;
	}
}

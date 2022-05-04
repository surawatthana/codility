package algoexpert.sorting.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;

class ThreeNumberSort {

	@Test
	void test() {
		assertTrue(Arrays.equals(new int[] { 0, 0, 0, 1, 1, 1, -1, -1 },
				new ThreeNumberSort().solution(new int[] { 1, 0, 0, -1, -1, 0, 1, 1 }, new int[] { 0, 1, -1 })));
	}

	public int[] mySolution(int[] array, int[] order) {
		int[] result = new int[array.length];

		int index = 0;
		for (int i = 0; i < order.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[j] == order[i]) {
					result[index++] = array[j];
				}
			}
		}

		return result;
	}

	public int[] mySolution1(int[] array, int[] order) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < order.length; i++) {
			map.put(order[i], 0);
		}

		for (int i = 0; i < array.length; i++) {
			int count = map.get(array[i]) + 1;
			map.put(array[i], count);
		}

		int index = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			for (int i = 0; i < entry.getValue(); i++) {
				array[index] = entry.getKey();
				index++;
			}
		}

		return array;
	}

	public int[] solution(int[] array, int[] order) {

		int firstIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == order[0]) {
				swap(array, firstIndex, i);
				firstIndex++;
			}
		}

		int lastIndex = array.length - 1;
		for (int i = array.length - 1; i > -1; i--) {
			if (array[i] == order[2]) {
				swap(array, lastIndex, i);
				lastIndex--;
			}
		}

		return array;
	}

	private void swap(int[] array, int firstIndex, int i) {
		int temp = array[i];
		array[i] = array[firstIndex];
		array[firstIndex] = temp;
	}

}

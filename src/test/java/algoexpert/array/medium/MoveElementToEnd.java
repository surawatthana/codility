package algoexpert.array.medium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class MoveElementToEnd {

	@Test
	void test() {
		moveElementToEnd(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2), 2);
	}

	public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
		Integer[] result = new Integer[array.size()];

		int indexStart = 0;
		int indexEnd = array.size() - 1;

		for (int i = 0; i < array.size(); i++) {
			int element = array.get(i);

			if (element == toMove) {
				result[indexEnd] = element;
				indexEnd--;
			} else {
				result[indexStart] = element;
				indexStart++;
			}
		}

		return Arrays.asList(result);
	}

}

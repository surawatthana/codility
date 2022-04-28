package algoexpert.array.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayOfProducts {

	@Test
	void test() {
		new ArrayOfProducts().myanswer(new int[] { 5, 1, 4, 2 });
	}

	public int[] myanswer(int[] array) {
		int[] result = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			int product = 1;
			for (int j = 0; j < array.length; j++) {
				if (i != j) {
					product *= array[j];
				}
			}
			result[i] = product;
		}

		return result;
	}

}

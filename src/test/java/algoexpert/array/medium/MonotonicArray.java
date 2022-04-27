package algoexpert.array.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonotonicArray {

	@Test
	void test1() {
		assertTrue( isMonotonic(new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001}));
	}

	public static boolean isMonotonic(int[] array) {

		Trend trend = null;

		for (int i = 0; i < array.length - 1; i++) {

			int before = array[i];
			int after = array[i + 1];

			if (trend == null) {
				if (after > before) {
					trend = Trend.INCREASING;
				} else if (after < before) {
					trend = Trend.DECREASING;
				}
			}

			if (Trend.DECREASING.equals(trend)) {

				if (after > before) {
					return false;
				}

			} else if (Trend.INCREASING.equals(trend)) {
				if (after < before) {
					return false;
				}
			}
			 
		}

		return true;
	}

	private enum Trend {
		INCREASING, DECREASING;
	}

}

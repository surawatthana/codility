package algoexpert.array.medium;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.*;

import org.junit.jupiter.api.Test;

class ThreeNumberSum {

	@Test
	void test() {
		System.out.println(new ThreeNumberSum().solve(new int[] {-8, -6, 1, 2, 3, 5, 6, 12}, 0));
	}

	public List<Integer[]> solve(int[] array, int targetSum) {
		Arrays.sort(array);
		List<Integer[]> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			int left = i + 1;
			int right= array.length - 1;
			
			while (left < right) {
				int sum = array[i] + array[left] + array[right];
				if( sum == targetSum) {
					list.add(new Integer[]{array[i], array[left], array[right]});
					left++;
					right--;
				} else if (sum < targetSum) {
					left++;
				} else if (sum > targetSum) {
					right--;
				}
			}
		}
		
		return list;
	}

}

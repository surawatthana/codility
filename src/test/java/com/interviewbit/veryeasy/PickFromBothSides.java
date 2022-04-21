package com.interviewbit.veryeasy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PickFromBothSides {

	@Test
	void test1() {
		assertEquals(8, new PickFromBothSides().solve(new int[] {5,-2, 3, 1, 2}, 3));
	}
	
	@Test
	void test2() {
		assertEquals(2, new PickFromBothSides().solve(new int[] {1, 2}, 1));
	}
	
	@Test
	void test3() {
		assertEquals(6253, new PickFromBothSides().solve(new int[] { -533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35 }, 48));
	}
	
	public int solve(int[] A, int B) {
		
		int max = Integer.MIN_VALUE;
		
		for (int i = -B; i <= 0; i++) {
			int index = 0;
			
			if (i<0) {
				index = i + A.length;
			} else {
				index = i;
			}
			
			int count = 0;
			int sum = 0;
			
			while(count < B) {
				if (index >= A.length) {
					index -= A.length;
				}
				sum += A[index];
				index++;
				count++;
			}
			
			max = Math.max(max, sum);
			
		}

		return max;
    }

}

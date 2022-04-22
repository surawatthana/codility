package com.interviewbit.veryeasy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreaterThanAll {

	@Test
	void test1() {
		assertEquals(4, new GreaterThanAll().solve(new int[] {1, 2, 3, 4}));
	}
	
	@Test
	void test2() {
		assertEquals(2, new GreaterThanAll().solve(new int[] {1, 1, 2, 2}));
	}
	
	@Test
	void test3() {
		assertEquals(6, new GreaterThanAll().solve(new int[] {1, 13155, 75564, 45867, 53279, 21897, 4705, 67890, 67933, 93473, 38352, 51944, 83100, 3458, 5347, 52973, 67118, 770, 38344, 6685, 41751, 68680, 58900, 93048, 84620, 52695, 9197, 65395, 41602, 70122, 91036, 76223, 26247, 4747, 73612, 32825, 63267, 75644, 99108, 36536, 24705, 98259, 72269, 75339, 65155, 7269, 63166, 88475, 27273, 43643, 76653, 47776, 23779, 27492, 35928, 16652, 48654, 89770, 90925, 6057, 90469, 50455, 51632, 31905, 98669, 49400, 26616, 9074, 94781, 7376, 50073, 38416, 27710, 91386, 52977, 46447, 94102, 5009, 76155, 77024, 82785, 12538, 1587, 68849, 86829, 62957, 73626, 72545, 99950, 88861, 23321, 30634, 35103, 51330, 59114, 84602, 41210, 84155, 26933, 41542 }));
	}
	
	
	public int solve(int[] A) {
		int count = 1;
		
		
		for (int i = 1; i < A.length ; i++) {
			boolean a = true;
			for (int j = i - 1; j >= 0; j--) {
				if (A[i] <= A[j]) {
					a = false;
					break;
				}
			}
			
			if (a) {
				count++;
			}
		}
		
		return count;
    }

}

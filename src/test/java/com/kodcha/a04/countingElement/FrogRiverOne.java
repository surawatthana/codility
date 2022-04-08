package com.kodcha.a04.countingElement;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

	public static void main(String[] args) {
		FrogRiverOne a = new FrogRiverOne();
		System.out.println(a.solution(5, new int[] {1, 3, 1, 4, 2, 3, 5, 4}) == 6);
		System.out.println(a.solution(3, new int[] {1, 3}) == -1);
		System.out.println(a.solution(2, new int[] {1, 1, 1, 1}) == -1);
		System.out.println(a.solution(3, new int[] {1, 4, 2, 3}) == 3);
		System.out.println(a.solution(2, new int[] {1, 4, 2, 3}) == 2);
		System.out.println(a.solution(4, new int[] {1, 2, 3, 2, 3, 3, 1, 2, 2, 4, 2, 1}) == 9);
		System.out.println(a.solution(4, new int[] {1, 2, 3, 2, 3, 3, 1, 2, 4, 4, 2, 1}) == 8);
		System.out.println(a.solution(4, new int[] {1, 2, 3, 4, 3, 3, 1, 2, 4, 4, 2, 1}) == 3);
	}

	public int solution(int X, int[] A) {
		Set<Integer> allValues = new HashSet<>();
		for (int i = 1; i <= X; i++) {
			allValues.add(Integer.valueOf(i));
		}
		Set<Integer> collectedValues = new HashSet<>();
		for( int i = 0; i< A.length; i++) {
			if(!collectedValues.contains(Integer.valueOf(A[i]))) {
				collectedValues.add(Integer.valueOf(A[i]));
			}
			
			if (collectedValues.containsAll(allValues)) {
				return i;
			}
		}
		
		return -1;
	}
}

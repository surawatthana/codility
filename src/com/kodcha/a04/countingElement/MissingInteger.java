package com.kodcha.a04.countingElement;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
	public static void main(String[] args) {
		MissingInteger a = new MissingInteger();
		System.out.println(a.solution(new int[] { 1, 3, 6, 4, 1, 2 }) == 5);
		System.out.println(a.solution(new int[] { 1, 3, 6, 4, 5, 2 }) == 7);
		System.out.println(a.solution(new int[] { 1, 3, 2 }) == 4);
		System.out.println(a.solution(new int[] { -1, -3 }) == 1);

		System.out.println(a.solution(new int[] { -1, -3 }) == 1);
		System.out.println(a.solution(new int[] { -1,-3, 2 }) == 1);
		System.out.println(a.solution(new int[] { -1,-3, 1 }) == 2);
		System.out.println(a.solution(new int[] { 0 }) == 1);
		System.out.println(a.solution(new int[] { -1_000_000 }) == 1);
		System.out.println(a.solution(new int[] { -1_000_000, 1 }) == 2);
		System.out.println(a.solution(new int[] { 1_000_000 }) == 1);
		System.out.println(a.solution(new int[] { 999999, 999998, 1000000}) == 1);
		System.out.println(a.solution(new int[] { 1, 3, 999999, 999998, 1000000}) == 2);
	}

	public int solution(int[] A) {

		Set<Integer> perfectSet = new HashSet<>();
		Set<Integer> testSet = new HashSet<>();

		for (int i = 0; i < A.length; i++) {
			perfectSet.add(i + 1);
			testSet.add(A[i]);
		}

		for (Integer currentValue : perfectSet) {
			if (!testSet.contains(currentValue)) {
				return currentValue;
			}
		}

		if (perfectSet.size() == testSet.size()) {
			return perfectSet.size() + 1;
		}

		return 1;
	}
}

package com.kodcha.a04.countingElement;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {
	public static void main(String[] args) {
		PermCheck a = new PermCheck();
		System.out.println(a.solution(new int[] {4, 1, 3, 2}) == 1);
		System.out.println(a.solution(new int[] {1}) == 1);
		System.out.println(a.solution(new int[] {2}) == 0);
	}

	public int solution(int[] A) {
		Set<Integer> testSet = new HashSet<>();
		Set<Integer> perfectSet = new HashSet<>();
		
		for(int i = 0; i<A.length; i++) {
			perfectSet.add(i+1);
			testSet.add(A[i]);
		}
		
		for(int current: perfectSet) {
			if(!testSet.contains(Integer.valueOf(current))) {
				return 0;
			}
		}
		
		return 1;

	}
}

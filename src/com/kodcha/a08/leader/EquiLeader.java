package com.kodcha.a08.leader;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.jupiter.api.Test;

class EquiLeader {

	@Test
	void test() {
		int numEquiLeader = this.solution(new int[] { 4, 3, 4, 4, 4, 2 });

		System.out.println(numEquiLeader);
	}

	public int solution(int[] A) {
		int candidate = findCandidate(A);
		int dominatorCount = 0;

		Map<Integer, Integer> dominatorMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < A.length; i++) {
			if (A[i] == candidate) {
				dominatorCount++;
				dominatorMap.put(i, dominatorCount);
			}
		}

		int equiLeaders = 0;
		if (dominatorCount > (A.length / 2)) {
			// find all equi leader sequences

			int lastCandidateOccurenceIndex = 0;
			int runningDominatorCount = 0;
			for (int i = 0; i < A.length - 1; i++) {
				if (A[i] == candidate) {
					lastCandidateOccurenceIndex = i;
					runningDominatorCount = dominatorMap.get(i);
				} else if (dominatorMap.get(lastCandidateOccurenceIndex) != null) {
					runningDominatorCount = dominatorMap.get(lastCandidateOccurenceIndex);
				}
				if (runningDominatorCount > (i + 1) / 2) {
					if ((dominatorCount - runningDominatorCount) > (A.length - (i + 1)) / 2) {
						equiLeaders++;
					}
				}
			}
		}
		return equiLeaders;

	}

	private int findCandidate(int[] A) {
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < A.length; i++) {
			if (stack.isEmpty()) {
				stack.add(A[i]);
			} else {
				if (stack.peek() == A[i]) {
					stack.push(A[i]);
				} else {
					stack.pop();
				}
			}
		}

		return stack.peek();
	}

	private int numberOfTimesToDivide(int N) {
		return (int) Math.floor(Math.log(N) / Math.log(2));
	}
}

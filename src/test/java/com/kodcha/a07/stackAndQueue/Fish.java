package com.kodcha.a07.stackAndQueue;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Stack;

import org.junit.jupiter.api.Test;

class Fish {

	@Test
	void test() {
		// 0 represents a fish flowing upstream.
		// 1 represents a fish flowing downstream.
		// 																	downstream
		// 																 -------------->
		assertTrue(this.solution(new int[] { 4, 3, 2, 1, 5 }, new int[] { 0, 1, 0, 0, 0 }) == 2);

		assertTrue(this.solution(new int[] { 4, 3, 2, 1, 5 }, new int[] { 1, 0, 1, 0, 1 }) == 3);
		assertTrue(this.solution(new int[] { 4, 3, 2, 0, 5 }, new int[] { 0, 1, 0, 0, 0 }) == 2);
		assertTrue(this.solution(new int[] { 4, 3, 2, 1, 5 }, new int[] { 0, 1, 0, 0, 0 }) == 2);
		assertTrue(this.solution(new int[] { 4, 3, 2, 1, 5 }, new int[] { 0, 1, 1, 0, 0 }) == 2);
		assertTrue(this.solution( new int [] { 4, 3, 2, 5, 6 }, new int [] { 1, 0, 1, 0, 1 }) == 2);
		assertTrue(this.solution( new int [] { 7, 4, 3, 2, 5, 6 }, new int [] { 0, 1, 1, 1, 0, 1 }) == 3);
		assertTrue(this.solution( new int [] { 3, 4, 2, 1, 5 }, new int [] { 1, 0, 0, 0, 0 }) == 4);
		assertTrue(this.solution( new int [] { 3 }, new int [] { 1 }) == 1);
		assertTrue(this.solution( new int [] { 3 }, new int [] { 0 }) == 1);
	}

	public int solution(int[] A, int[] B) {
		final int UPSTREAM = 0;
		Stack<MyFish> stack = new Stack<>();
		
		stack.push(new MyFish(B[0], A[0]));

		for (int i =1 ; i< A.length; i++) {
			if (B[i] == stack.peek().getDirection()) {
				stack.push(new MyFish(B[i], A[i]));
			} else if (UPSTREAM == stack.peek().getDirection()) {
				stack.push(new MyFish(B[i], A[i]));
			} else {
				while(!stack.isEmpty()) {
					if (stack.peek().getDirection() == B[i]) {
						stack.push(new MyFish(A[i], B[i]));
						break;
					} else {
						if (stack.peek().getSize() > A[i]) {
							break;
						}else {
							stack.pop();
							continue;
						}
					}
				}
				
				if(stack.isEmpty()) {
					stack.push(new MyFish(A[i], B[i]));
				}
			}
		}

		return stack.size();
	}

	public int thePerfectSolution(int[] A, int[] B) {
		final int UPSTREAM = 0;

		Stack<MyFish> fishStack = new Stack();
		fishStack.push(new MyFish(A[0], B[0]));

		for (int i = 1; i < A.length; i++) {
			if (B[i] == fishStack.peek().getDirection()) { // same direction, so put another fish on stack
				fishStack.push(new MyFish(A[i], B[i]));
			} // if top of stack fish is upstream, not right condition to see who's eating who
			else if (fishStack.peek().getDirection() == UPSTREAM) {
				fishStack.push(new MyFish(A[i], B[i]));
			} else { // figure out who's eating who
				while (!fishStack.isEmpty()) { // current fish is swimming in same direction as top of stack fish - they can't eat other
					if (fishStack.peek().direction == B[i]) {
						fishStack.push(new MyFish(A[i], B[i]));
						break;
					} else { // existing fish that was on stack eats latest fish
						if (fishStack.peek().size > A[i]) {
							break; // eating finished
						} else {
							fishStack.pop();
							continue; // keep checking other elements on stack
						}
					}
				}
				if (fishStack.isEmpty()) {
					fishStack.push(new MyFish(A[i], B[i])); // current fish ate all the fish in the stack
				}
			}
		}
		return fishStack.size();
	}

	private class MyFish {
		private int direction;
		private int size;

		public MyFish(int direction, int size) {
			this.direction = direction;
			this.size = size;
		}

		public int getDirection() {
			return direction;
		}

		public void setDirection(int direction) {
			this.direction = direction;
		}

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}

		@Override
		public String toString() {
			return "MyFish [direction=" + direction + ", size=" + size + "]";
		}
	}

}

//for (int i = 0; i < B.length; i++) {
//MyFish currentFish = new MyFish(B[i], A[i]);
//
//if (stack.isEmpty()) {
//	stack.push(currentFish);
//} else {
//	MyFish peekedFish = stack.peek();
//
//	if (currentFish.getDirection() == 0 && peekedFish.getDirection() == 1) {
//		if (currentFish.getSize() > peekedFish.getSize()) {
//			stack.pop();
//			stack.push(currentFish);
//		}
//	} else {
//		stack.push(currentFish);
//	}
//}
//
//}

package com.interviewbit.veryeasy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TotalMoveForBishop {

	@Test
	void test1() {
		assertEquals(13, new TotalMoveForBishop().solution2(4, 4));
	}
	
	@Test
	void test2() {
		assertEquals(9, new TotalMoveForBishop().solution2(2, 4));
	}

	public int solution2(int A, int B) {

		int moves = 0;
		int step = 1;
		boolean canMove = true;

		while (canMove) {

			boolean moveRightUp = A + step <= 8 && B + step <= 8;
			boolean moveRightDown = A - step >= 1 && B + step <= 8;
			boolean moveLeftUp = A + step <= 8 && B - step >= 1;
			boolean moveLeftDown = A - step >= 1 && B - step >= 1;

			if (moveRightUp) {
				moves++;
			}

			if (moveRightDown) {
				moves++;
			}

			if (moveLeftUp) {
				moves++;
			}

			if (moveLeftDown) {
				moves++;
			}
			
			step++;

			if (!moveRightUp && !moveRightDown && !moveLeftUp && !moveLeftDown) {
				canMove = false;
			}
		}

		return moves;
	}

}

package algoexpert.array.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.*;

class SpiralTraverse {

	@Test
	void test() {
		int[][] array = new int[4][4];

		array[0][0] = 1;
		array[0][1] = 2;
		array[0][2] = 3;
		array[0][3] = 4;

		array[1][0] = 12;
		array[1][1] = 13;
		array[1][2] = 14;
		array[1][3] = 5;

		array[2][0] = 11;
		array[2][1] = 16;
		array[2][2] = 15;
		array[2][3] = 6;

		array[3][0] = 10;
		array[3][1] = 9;
		array[3][2] = 8;
		array[3][3] = 7;

		SpiralTraverse.solution1(array);
	}

	/**
	 * myanswer is not clean
	 * @param array
	 * @return
	 */
	public static List<Integer> myanswer(int[][] array) {

		int totalMoves = 0;
		Set<String> pathVisited = new HashSet<>();

		for (int i = 0; i < array.length; i++) {
			int[] a = array[i];
			for (int j = 0; j < a.length; j++) {
				totalMoves++;
			}
		}

		List<Integer> result = new ArrayList<Integer>();

		int x = 0, y = 0;
		DIRECTION direction = DIRECTION.RIGHT;
		while (totalMoves >= 1) {
			result.add(array[x][y]);
			totalMoves--;
			pathVisited.add(x + "," + y);

			if (DIRECTION.RIGHT.equals(direction)) {
				int nextRight = y + 1;
				String nextMove = x + "," + nextRight;
				if (!pathVisited.contains(nextMove) && nextRight < array[x].length) {
					y++;
				} else {
					x++;
					direction = DIRECTION.DOWN;
				}
			} else if (DIRECTION.DOWN.equals(direction)) {
				int nextDown = x + 1;
				String nextMove = nextDown + "," + y;
				if (!pathVisited.contains(nextMove) && nextDown < array.length) {
					x++;
				} else {
					y--;
					direction = DIRECTION.LEFT;
				}
			} else if (DIRECTION.LEFT.equals(direction)) {
				int nextLeft = y - 1;
				String nextMove = x + "," + nextLeft;
				if (!pathVisited.contains(nextMove) && nextLeft >= 0) {
					y--;
				} else {
					x--;
					direction = DIRECTION.UP;
				}
			} else if (DIRECTION.UP.equals(direction)) {
				int nextUp = x - 1;
				String nextMove = nextUp + "," + y;
				if (!pathVisited.contains(nextMove) && nextUp >= 0) {
					x--;
				} else {
					y++;
					direction = DIRECTION.RIGHT;
				}
			}
		}

		return result;
	}

	/**
	 * clean approach
	 * @param array
	 * @return
	 */
	public static List<Integer> solution1(int[][] array) {
		if (array.length == 0)
			return new ArrayList<Integer>();

		var result = new ArrayList<Integer>();
		var startRow = 0;
		var endRow = array.length - 1;
		var startCol = 0;
		var endCol = array[0].length - 1;

		while (startRow <= endRow && startCol <= endCol) {
			//right
			for (int col = startCol; col <= endCol; col++) {
				result.add(array[startRow][col]);
			}

			//down
			for (int row = startRow + 1; row <= endRow; row++) {
				result.add(array[row][endCol]);
			}

			//left
			for (int col = endCol - 1; col >= startCol; col--) {
				if (startRow == endRow)
					break;
				result.add(array[endRow][col]);
			}

			//up
			for (int row = endRow - 1; row > startRow; row--) {
				if (startCol == endCol)
					break;
				result.add(array[row][startCol]);
			}
			startRow++;
			endRow--;
			startCol++;
			endCol--;
		}

		return result;
	}

	private static enum DIRECTION {
		RIGHT, DOWN, LEFT, UP;
	}

}

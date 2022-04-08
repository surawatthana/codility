package com.kodcha.a07.stackAndQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Stack;

import org.junit.jupiter.api.Test;

class StoneWall {

	@Test
	void test() {
//		assertEquals(this.solution(new int[] { 8, 8, 5, 7, 9, 8, 7, 4, 8 }), 7);
//		assertEquals(this.solution(new int[] { 8, 8, 5, 7, 9, 8, 7, 5, 8 }), 6);
//		assertEquals(this.solution(new int[] { 1, 2, 3, 4, 3 }), 4);
//		assertEquals(this.solution(new int[] { 8, 8, 5 }), 2);
//		assertEquals(this.solution(new int[] { 8 }), 1);
//		assertEquals(this.solution(new int[] { 8, 8 }), 1);
//		assertEquals(this.solution(new int[] { 8, 8, 8, 8, 8 }), 1);
//		assertEquals(this.solution(new int[] { 1000000000 }), 1);
//		assertEquals(this.solution(new int[] { 1000000000, 2 }), 2);
//		assertEquals(this.solution(new int[] { 2, 1000000000, 2 }), 2);
//		assertEquals(this.solution(new int[] { 2, 1000000000, 2, 1000000000 }), 3);
//		assertEquals(this.solution(new int[] { 2, 1000000000, 2, 1000000000, 1000000000 }), 3);
		assertEquals(this.solution(new int[] { 8, 8, 5, 7, 9, 8, 7, 4, 8 }), 7);
	}

	public int mysolution(int[] H) {
		int counter = 1;

		for (int i = 1; i < H.length; i++) {
			int currentHeight = H[i];
			int previousHeight = H[i - 1];

			if (currentHeight > previousHeight) {// increases
				counter++;
			} else if (currentHeight < previousHeight) {// decreases

				int lastMin = Integer.MAX_VALUE;
				int lastMinPostion = -1;

				for (int k = i - 1; k >= 0; k--) {
					if (H[k] < lastMin) {
						lastMin = H[k];
						lastMinPostion = k;
					}
				}

				boolean isNew = true;
				HERE: for (int j = i - 1; j >= lastMinPostion; j--) {
					if (H[j] == currentHeight) {
						isNew = false;
						break HERE;
					}
				}

				if (isNew) {
					counter++;
				}
			}
		}

		return counter;
	}

	public int solution(int[] H) {
		Block currentBlock = new Block(0, H[0]);
		Stack<Block> blockStack = new Stack();

		blockStack.add(currentBlock);
		int blocksRequired = 1;

		for (int i = 1; i < H.length; i++) {
			Block topStackBlock = blockStack.peek(); 
			// remove any stack blocks that are taller than current block
			while (topStackBlock.upperHeight > H[i]) {
				blockStack.pop();
				if (!blockStack.isEmpty()) {
					topStackBlock = blockStack.peek();
				} else {
					break;
				}
			}

			if (blockStack.isEmpty()) {
				blockStack.push(new Block(0, H[i]));
				blocksRequired++;
			}
			// block already exists in stack
			else if (blockStack.peek().upperHeight - H[i] == 0) {
				continue;
			}
			// put in a new block - need to calculate delta between tallest stack block and
			// current block
			else {
				topStackBlock = blockStack.peek();
				blockStack.push(new Block(blockStack.peek().upperHeight, H[i]));
				blocksRequired++;
			}
		}

		return blocksRequired;
	}

	private class Block {
		private int lowerHeight;
		private int upperHeight;

		Block(int lowerHeight, int upperHeight) {
			this.lowerHeight = lowerHeight;
			this.upperHeight  = upperHeight;
		}

		@Override
		public String toString() {
			return "Block [lowerHeight=" + lowerHeight + ", upperHeight=" + upperHeight + "]";
		}
		
		
	}

}

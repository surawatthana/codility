package algoexpert.binarysearchtree.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindClosestValue {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	public int solve(BST tree, int target) {
		
		return this.findClosestValue(tree, target, tree.value);
	}
	
	private int findClosestValue(BST tree, int target, int closest) {
		
		if (target == closest) {
			return target;
		}
		
		
		
		
		return 
	}
	
	private class BST {
	    public int value;
	    public BST left;
	    public BST right;

	    public BST(int value) {
	      this.value = value;
	    }
	  }

}

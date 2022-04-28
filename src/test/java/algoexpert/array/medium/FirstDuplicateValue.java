package algoexpert.array.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;
class FirstDuplicateValue {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	public int myAnswer(int[] array) {
		
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < array.length; i++) {
			int value = array[i];
			
			if (set.contains(value)) {
				return value;
			} else {
				set.add(value);
			}
		}
		
		
		
	    return -1;
	  }

}

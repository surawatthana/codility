package algoexpert.array.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;
class MergeOverlappingInterval {

	@Test
	void test1() {
		new MergeOverlappingInterval().mySolution(new int[][] {
			new int[] {1,2},
			new int[] {3,5},
			new int[] {4,7},
			new int[] {6,8},
			new int[] {9,10}
		});
	}
	
//	@Test
	void test3() {
		new MergeOverlappingInterval().mySolution(new int[][] {
			new int[] {1,10},
			new int[] {10,20},
			new int[] {20,30},
			new int[] {30,40},
			new int[] {40,50},
			new int[] {50,60},
			new int[] {60,70},
			new int[] {70,80},
			new int[] {80,90},
			new int[] {90,100},
		});
	}
	
	public int[][] mySolution(int[][] intervals) {
		
	    int[][] sortedIntervals = intervals.clone();
	    Arrays.sort(sortedIntervals, (a, b) -> Integer.compare(a[0], b[0]));
	    
	    List<int[]> mergedIntervals = new ArrayList<int[]>();
	    int[] currentInterval = sortedIntervals[0];
	    mergedIntervals.add(currentInterval);
	    
	    for (int[] nextInterval : sortedIntervals) {
	        int currentIntervalEnd = currentInterval[1];
	        int nextIntervalStart = nextInterval[0];
	        int nextIntervalEnd = nextInterval[1];
	        
	        if (currentIntervalEnd >= nextIntervalStart) {
	            currentInterval[1] = Math.max(currentIntervalEnd, nextIntervalEnd);
	        } else {
	            currentInterval = nextInterval;
	            mergedIntervals.add(currentInterval);
	        }
	    }
	    
	    return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
	  }

}

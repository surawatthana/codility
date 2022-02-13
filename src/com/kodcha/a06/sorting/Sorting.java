package com.kodcha.a06.sorting;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class Sorting {

	@Test
	void test() throws InterruptedException {
		List<Integer> intList = new ArrayList<>();
		IntStream.rangeClosed(0, 400_000).parallel().forEach(i -> intList.add(i));
		
		int[] intArray = new int[intList.size()];
		
		long now = LocalDateTime.now().getLong(ChronoField.MILLI_OF_DAY);   
		long minutesLater = LocalDateTime.now().plusMinutes(2).getLong(ChronoField.MILLI_OF_DAY);
		while(now < minutesLater){
		    now = LocalDateTime.now().getLong(ChronoField.MILLI_OF_DAY);  
		}

		Iterator<Integer> iterator = intList.iterator();
		int index = 0;
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer != null) {
				intArray[index] = integer;
			} else {
				new NullPointerException();
			}
		}
		
		int[] selectSortResult = new MySelectionSort().solution(intArray);
		int[] countingSortResult = new MyCountingSort().solution(intArray);
		int[] mergeSortResult = new MyMergeSort().solution(intArray);

//		assertTrue(Arrays.equals(new MyCountingSort().solution(intArray), new MySelectionSort().solution(intArray)));
		assertThat(selectSortResult, allOf(is(countingSortResult), is(mergeSortResult)));

	}

}

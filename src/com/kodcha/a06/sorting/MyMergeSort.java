package com.kodcha.a06.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class MyMergeSort {

	public int[] solution(int[] A) {
		LocalDateTime start = LocalDateTime.now();
		this.mergeSort(A);
		System.out.println("merge sort in nanos: " + Duration.between(start, LocalDateTime.now()).toNanos());
		return A;
	}

	public void mergeSort(int[] A) {

		int arrayLength = A.length;

		if (arrayLength < 2) {
			return;
		}

		int mid = arrayLength / 2;

		int[] leftHalf = new int[mid];
		int[] rightHalf = new int[arrayLength - mid];

		for (int i = 0; i < mid; i++) {
			leftHalf[i] = A[i];
		}

		for (int i = mid; i < A.length; i++) {
			rightHalf[i - mid] = A[i];
		}

		mergeSort(leftHalf);
		mergeSort(rightHalf);

		// merge
		merge(A, leftHalf, rightHalf);
	}

	private void merge(int[] intArray, int[] leftHalf, int[] rightHalf) {
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;

		int i = 0, j = 0, k = 0;

		while (i < leftSize && j < rightSize) {
			if (leftHalf[i] <= rightHalf[j]) {
				intArray[k] = leftHalf[i];
				i++;
			} else {
				intArray[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		
		while ( i< leftSize) {
			intArray[k] = leftHalf[i];
			i++;
			k++;
		}
		
		while(j < rightSize) {
			intArray[k] = rightHalf[j];
			j++;
			k++;
		}
	}

}

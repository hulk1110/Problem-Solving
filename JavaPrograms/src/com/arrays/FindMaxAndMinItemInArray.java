package com.arrays;

import java.util.Arrays;

public class FindMaxAndMinItemInArray {

	static class Pair {

		int min;
		int max;
	}

	static Pair getMinMax(int arr[]) {
		Pair minmax = new Pair();

		if (arr.length == 1) {
			minmax.min = arr[0];
			minmax.max = arr[0];
			return minmax;
		}

		if (arr[0] > arr[1]) {
			minmax.min = arr[1];
			minmax.max = arr[0];
		} else {
			minmax.max = arr[1];
			minmax.min = arr[0];
		}

		for (int i = 2; i < arr.length - 1; i++) {
			if (arr[i] > minmax.max) {
				minmax.max = arr[i];

			} else if (arr[i] < minmax.min) {
				minmax.min = arr[i];

			}
		}
		return minmax;

	}

	public static void main(String[] args) {
		// primitive way (not recommended)
		int arr[] = { 3, 6, 33, 1, 97, 6 };
		// sort
		Arrays.sort(arr);
		System.out.println("min" + arr[0]);
		System.out.println("max" + arr[arr.length - 1]);
		// optimise ways with less no of comparation
		int arr2[] = { 3, 6, 33, 1, 97, 6 };
		System.out.println("Minimun in array"+getMinMax(arr2).min);
		System.out.println("Maximum in array"+getMinMax(arr2).max);

	}
}

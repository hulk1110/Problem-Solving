package com.arrays;

public class MoveAllNegativElementsToOneSide {
	public static void main(String[] args) {
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		int n = arr.length;

		rearrange(arr, n);
		printArray(arr, n);
	}
//method1
	private static void rearrange(int[] arr, int n) {
		int j = 0;
		int temp;
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				if (i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
			//uncomment below lines to understand flow
//			System.out.println("After end of Pass "+ i);
//			printArray(arr, arr.length);
		}
		

	}

	private static void printArray(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println( arr[i] + "");
		}
	}
}

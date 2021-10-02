package com.arrays;

public class MaximumSubarrayProblem {
	public static void main(String[] args) {
		int ipArr[] = { -2, -3, 4, 8};
		maxSubArray(ipArr);
	}

	private static void maxSubArray(int[] ipArr) {
		int maxSumSoFar = Integer.MIN_VALUE;

		int start = 0;
		int end = 0;
		for (int i = 0; i < ipArr.length; i++) {
			int maxSumAtThisIndex = 0;
			for (int j = i; j < ipArr.length; j++) {
				maxSumAtThisIndex += ipArr[j];
				if (maxSumAtThisIndex > maxSumSoFar) {
					maxSumSoFar = maxSumAtThisIndex;
					start = i;
					end = j;
				}
			}
		}
		System.out.println("The maxsum is " + maxSumSoFar + " which is found between index " + start + " and " + end);

	}
}

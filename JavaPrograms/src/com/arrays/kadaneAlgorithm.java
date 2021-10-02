package com.arrays;

public class kadaneAlgorithm {
	public static void main(String[] args) {

		int ipArr[] = { -2, -3, 4, 8 };
		maxSubArray(ipArr);

	}

	private static void maxSubArray(int[] ipArr) {
		int maxsum = Integer.MIN_VALUE;
		int sumAtthisIndex = 0;
		int start = 0;
		int end = 0;
		int s = 0;
		for (int i = 0; i < ipArr.length; i++) {

			sumAtthisIndex = sumAtthisIndex + ipArr[i];
			if (sumAtthisIndex > maxsum) {
				maxsum = sumAtthisIndex;
				start = s;
				end = i;
			}
			if (sumAtthisIndex < 0) {
				sumAtthisIndex = 0;
				s = i + 1;
			}

		}
		System.out.println("MAX sum is " + maxsum + " which starts between  index " + start + " and " + end);

	}
}

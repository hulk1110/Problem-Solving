package com.recursion;

public class GCDofTwoNumbers {
	public static void main(String[] args) {
		System.out.println(getMeGCD(48, 18));
	}

	private static int getMeGCD(int i, int j) {
		if (i < 0 || j < 0)
			return -1;
		if (j == 0)
			return i;
		return getMeGCD(j, i % j);
	}
}

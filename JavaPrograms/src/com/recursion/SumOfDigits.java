package com.recursion;

public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println(getMeSumOfDigits(2067));
	}

	private static int getMeSumOfDigits(int n) {
//base condition
		if (n == 0 || n < 0) {
			return 0;
		}

		return (n % 10) + getMeSumOfDigits(n / 10);

	}
}

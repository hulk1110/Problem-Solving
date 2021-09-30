package com.recursion;

public class PowerOfANumber {
public static void main(String[] args) {
	System.out.println(findPower(29,8));
}

private static int findPower(int base, int exp) {
	if(exp<0) {
		return -1;
	}
	if(exp==0 || exp==1) {
		return base;
	}
	return base*findPower(base, exp-1);
}
}

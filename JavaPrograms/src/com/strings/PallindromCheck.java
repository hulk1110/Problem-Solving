package com.strings;

public class PallindromCheck {
	public static void main(String[] args) {
		System.out.println("is given string pallindrome ? " + ispallindrome("abba"));
		System.out.println("is given string pallindrome ? " + ispallindrome2("abbab"));
	}

	private static Boolean ispallindrome(String string) {

		if (string.equalsIgnoreCase(getMereverse(string))) {
			return true;
		}
		return false;
	}

	private static String getMereverse(String string) {
		char[] charArr = string.toCharArray();
		Character temp;
		int start = 0;
		int end = charArr.length - 1;
		while (start < end) {
			temp = charArr[start];
			charArr[start] = charArr[end];
			charArr[end] = temp;
			start++;
			end--;
		}
		String revered = new String(charArr);
		//System.out.println("reversed String is " + revered);
		return revered;
	}

	private static Boolean ispallindrome2(String string) {

		char[] charArr = string.toCharArray();
		Character temp;
		int start = 0;
		int end = charArr.length - 1;
		while (start < end) {
			if (charArr[start] != charArr[end]) {

				return false;
			} else {

				start++;
				end--;

			}
		}
		return true;

	}
}

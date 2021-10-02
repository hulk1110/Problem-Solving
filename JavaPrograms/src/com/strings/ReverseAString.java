package com.strings;

public class ReverseAString {
	public static void main(String[] args) {
		System.out.println("Reverse of String "+ getMeReverse("Hello"));
	}

	private static String getMeReverse(String string) {
		
		char charArray[] = string.toCharArray();
		
		if(charArray.length==0) {
			return new String("");
		}
		char temp;
		int first = 0;
		int last = charArray.length-1;
		while(first <last) {
			temp= charArray[first];
			charArray[first]=charArray[last];
			charArray[last]= temp;
			first++;
			last--;
		}
		
		return new String(charArray);
	}

}

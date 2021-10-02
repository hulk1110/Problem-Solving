package com.strings;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharInString {
	public static void main(String[] args) {
		getMeDuplicateCharacter("geeksforgeeks");
	}

	private static void getMeDuplicateCharacter(String string) {
		char charArray[] = string.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < charArray.length; i++) {
			if (map.containsKey(charArray[i])) {
				map.put(charArray[i], map.get(charArray[i]) + 1);
			} else {
				map.put(charArray[i], 1);
			}
		}
		System.out.print("Duplicate character in given String are : ");

		map.forEach((k, v) -> {
			if (v > 1) {
				//System.out.println("DUplicate characters are: " + k);
				String op= Character.toString(k);
				
				 System.out.print(op + " ");
			}
		});

	}
}

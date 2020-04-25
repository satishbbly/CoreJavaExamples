package com.satish.java;

import java.util.Map;

public class RomanToInt {

	public static void main(String[] args) {
		System.out.println(romanToInt("CCXLVIII"));
	}

	private static int romanToInt(String s) {

		Map<Character, Integer> romanMap = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

		
		int i = 0;
		for (int j = 0; j < s.length(); j++) {
			if (j > 0 && romanMap.get(s.charAt(j)) > romanMap.get(s.charAt(j - 1))) {
				i += romanMap.get(s.charAt(j)) - 2 * romanMap.get(s.charAt(j - 1));
			} else
				i += romanMap.get(s.charAt(j));
		}
		return i;

	}

}

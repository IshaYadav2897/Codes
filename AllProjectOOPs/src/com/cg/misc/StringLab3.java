package com.cg.misc;
public class StringLab3 {
	public void addString(String s1) {
		System.out.println("String: " + s1 + s1);
	}

	public void replaceOdd(String s2) {
		for (int i = 0; i < s2.length(); i++) {
			if ((i % 2) == 0) {
				s2 = s2.replace(s2.charAt(i), '#');
			}
		}
		System.out.println("Replaced String: " + s2);
	}

	public void removeDuplicateChar(String s3) {
		String temp = "";
		for (int i = 0; i < s3.length(); i++) {
			if (!temp.contains(String.valueOf(s3.charAt(i)))) {
				temp = temp + s3.charAt(i);
			}
		}
		System.out.println("Removed String: " + temp);
	}

	public void oddUpperCase(String s4) {
		String s = "";
		char c = ' ';
		for (int i = 0; i < s4.length(); i++) {
			if (i % 2 == 0) {
				c = s4.charAt(i);
				s += String.valueOf(Character.toUpperCase(c));
			} else {
				c = s4.charAt(i);
				s += String.valueOf(Character.toLowerCase(c));
			}
		}
		System.out.println("Odd Uppercase: " + s);
	}

}

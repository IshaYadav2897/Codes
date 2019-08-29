package com.cg.misc;

public class PositiveString {
	public void checkStringPositive(String s1)
	{
		s1 = s1.toLowerCase();
		char c;
		int previousNum = 0, currentNum= 0, count = 0; 
		for (int i = 0; i < s1.length(); i++) {
			c =	s1.charAt(i);
			currentNum = Character.getNumericValue(c);
			if(previousNum>currentNum)
			{
				System.out.println("String is negative");
				count++;
			}
			previousNum = currentNum;
		}
		if(count == 0)
			System.out.println("String is positive");
	}
}

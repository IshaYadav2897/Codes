package com.cg.misc;

//1. Only 1 occurances of @ and . allowed 
//2. Min 4 chars before @
//3. Min 3 chars between @ and .
//4. Min 2 chars after .
public class EmailValidator {
	public static void main(String[] args) {
		String email = "zuba@mai.co";
		int atindex = email.indexOf('@');
		int dotindex = email.indexOf('.');
		if((atindex<4) || ((dotindex-atindex)<3) || ((email.length()-dotindex)<2))
		{
			System.out.println("incorrect");
		}
		else
		{
			System.out.println("correct");
		}
		
	}

}

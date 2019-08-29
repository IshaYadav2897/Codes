package com.cg.misc;
import java.util.regex.*;

public class CmdLineDemo {
	public static void main(String[] args) {
		/*int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		System.out.println("Sum is: " + sum);
		
		int x =10;
		Integer xobj = x; //wrapping primitive in object - Boxing
		
		int z = xobj; //Unwrapping - Unboxing
		*/
		System.out.println(Pattern.matches("^(.+)@(.+)$", args[0]));
		
		StringBuilder ab = new StringBuilder("Hello");
		System.out.println("length:"+ab.length());
		
		String week = "Sun-Mon-Tue-Wed-Thu-Fri-Sat";
		String[] ans = week.split("-");
		for(String a:ans)
		{
			System.out.println(a);
		}
	}
}

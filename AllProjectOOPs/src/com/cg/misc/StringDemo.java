package com.cg.misc;
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		s1 = s1+"World";
		
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,7));
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.replace('e', 'a'));
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		
		int index = s1.indexOf('l');
		int count = 0;
		while(index>=0)
		{
			System.out.println(index);
			index = s1.indexOf('l',index+1);
			count++;
		}
		System.out.println("count is:"+count);
	}
}

package com.cg.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.cg.bank.Person;

public class PersonReflect {
	public static void main(String[] args) {
		Person p = new Person("Polo",21);
		
		Class pc = p.getClass();
		System.out.println(pc);
		
		Constructor[] constructors = pc.getConstructors();
		System.out.println("--List of constructors");
		for(Constructor c : constructors)
			System.out.println(c);
		
		Method[] methods = pc.getMethods();
		System.out.println("--List of methods");
		for(Method m : methods)
			System.out.println(m);
		
		Method[] decMethods = pc.getDeclaredMethods();
		System.out.println("--List of Person methods");
		for(Method m : decMethods)
			System.out.println(m);
		
		Field[] fields = pc.getFields();
		System.out.println("--List of fields");
		for(Field f : fields)
			System.out.println(f);
	}
}

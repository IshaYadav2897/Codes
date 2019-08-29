package com.cg.bank;
	
public class Person {
	private String name;
	private double age;
	
	public Person() {
	}

	public Person(String name, double age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	private void print()
	{
		System.out.println("Name=" + name + ", Age=" + age );
	}
	
	@Override
	public String toString() {
		return "Person [Name=" + name + ", Age=" + age + "]";
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person)
		{
			Person p = (Person) obj;
			if(p.name.equals(this.name) && this.age == p.age)//this.name means p1 & p.name means p2
			{
				return true;				
			}
		}
		return false;
	}

	/*public static void main(String[] args) {
		Person p1 = new Person("Polo", 21);
		Person p2 = new Person("Lili", 21);
		p1.print();
		System.out.println(p1.hashCode());
		System.out.println(p1.toString());
		System.out.println(p1.equals(p2));
		
		
	}*/

	
}

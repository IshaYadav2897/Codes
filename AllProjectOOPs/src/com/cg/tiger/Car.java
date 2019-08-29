package com.cg.tiger;

public class Car {
	private String model;
	private String[] features;
	
	public Car(String model, String... features) {
		super();
		this.model = model;
		this.features = features;
	}
	
	public void specs()
	{
		System.out.println("Features of " + model);
		for(String f: features)
			System.out.println(f);
		
	}
	
	public static void main(String[] args) {
		Car c1 = new Car("Audi", "Autodrive", "Air-bag", "Music");
		c1.specs();
		
		Car c2 = new Car("Jaguar", "Autodrive", "Music");
		c2.specs();
	}
}

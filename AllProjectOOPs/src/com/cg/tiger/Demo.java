package com.cg.tiger;

public class Demo {
	private Object data;

	public Demo(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo("Hello");
		System.out.println(d1.getData());
		d1.setData(1000);
		d1.setData(new Car("Jaguar", "Airbags"));
		System.out.println(d1.getData());
	}
}

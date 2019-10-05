package com.cg.misc;


public class TestEvent {
	public static void main(String[] args) {
		EventImpl ei = new EventImpl();
		ei.doSomething();
		
		//Instantiating public inner class
		//Event inner = ei.new InnerEventImpl();
		
		//Instatiating static inner class
		//Event inner = new EventImpl.InnerEventImpl();
		//inner.doSomething();
		
		ei.secondEvent();
		ei.thirdEvent();
		ei.oneMoreEvent();
		ei.oneLastEvent();
		
	}
	
	
  
}

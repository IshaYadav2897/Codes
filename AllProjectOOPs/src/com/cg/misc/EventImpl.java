package com.cg.misc;

public class EventImpl implements Event {

	@Override
	public void doSomething() {
		System.out.println("First event impl");
	}

	private static class InnerEventImpl implements Event{
		 @Override
			public void doSomething() {
				System.out.println("Second event impl");
			}	
		}
	
	//to access the static class inner method
	public void secondEvent(){
		Event e = new InnerEventImpl();
		e.doSomething();
	}

	//methods can not have public and static 
	public void thirdEvent() {
		class NestedEvent implements Event{

			@Override
			public void doSomething() {
				System.out.println("Third event impl");
			}
		}
			new NestedEvent().doSomething();
		
	}

	
	public void oneMoreEvent() {
		Event e = new Event() {

			@Override
			public void doSomething() {
				System.out.println("Fourth event impl");
			}	
		};
		e.doSomething();
	}
	
	//lambda expressions
	public void oneLastEvent(){
		Event e = () -> System.out.println("Fifth event impl");
		e.doSomething();
	}
}

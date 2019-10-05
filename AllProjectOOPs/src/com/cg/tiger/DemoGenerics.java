package com.cg.tiger;

public class DemoGenerics<I> {

		private I data;

		public DemoGenerics(I data) {
			this.data = data;
		}

		public I getData() {
			return data;
		}

		public void setData(I data) {
			this.data = data;
		}
		
		public static void main(String[] args) {
			DemoGenerics<String> d1 = new DemoGenerics<String>("Hello");
			System.out.println(d1.getData());
			d1.setData("Isha");
			
			DemoGenerics<Integer> d2 = new DemoGenerics<Integer>(22);
			System.out.println(d2.getData());
			
			Car c1 = null;
			DemoGenerics<Car> d3 = new DemoGenerics<Car>(c1);
			d3.setData(new Car("Jaguar", "Airbags"));
			System.out.println(d3.getData());
			
		}
	}



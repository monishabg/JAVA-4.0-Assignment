package com.observer.example;

public class MobileApp implements Observer {
	private String name;
	
	public MobileApp(String name) {
		this.name=name;
	}
	@Override
	public void update(double price) {
		// TODO Auto-generated method stub
		System.out.println(name+ " -mobile app recieved stock update: $" + price );

	}

}

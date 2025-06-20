package com.observer.example;

public class WebApp implements Observer {
	private String name;
	public WebApp(String name){
		this.name=name;
	}
	

	@Override
	public void update(double price) {
		// TODO Auto-generated method stub
		System.out.println(name + "-WebApp recieved stock update: $" + price);
	}

}

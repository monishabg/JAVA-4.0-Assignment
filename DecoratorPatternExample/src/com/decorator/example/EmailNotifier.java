package com.decorator.example;

public class EmailNotifier implements Notifier {

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sending Email:" + message);

	}

}

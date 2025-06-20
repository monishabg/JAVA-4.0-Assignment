package com.proxy.example;

public class RealImage implements Image {
	private String filename;
	
	public RealImage(String filename) {
		this.filename=filename;
		loadFromRemoteServer();
	}
	
	private void loadFromRemoteServer() {
		System.out.println("Loading image from remote server: " + filename);
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying: " + filename);

	}

}

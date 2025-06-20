package com.singleton.example;

public class LoggerTest {
	public static void main(String[] args) {
		Logger logger1 = Logger.getInstance();
		logger1.log("First log message");
		
		Logger logger2 = Logger.getInstance();
		logger2.log("Second log message");
		
		if(logger1==logger2) {
			System.out.println("Both logger instance are the same");
		}else {
			System.out.println("different logger instances");
		}
	}

}

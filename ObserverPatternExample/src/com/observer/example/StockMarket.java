package com.observer.example;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
	private List<Observer> observers = new ArrayList<>();
	private double stockPrice;
	
	public void setStockPrice(double price) {
		this.stockPrice=price;
		notifyObservers();
	}
	
	public double getStockPrice() {
		return stockPrice;
	}
	
	@Override 
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer o: observers) {
			o.update(stockPrice);
		}

	}

}

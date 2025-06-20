package com.observer.example;

public class ObserverPatternTest {
	public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile1 = new MobileApp("Monisha");
        Observer web1 = new WebApp("Philo");

        market.registerObserver(mobile1);
        market.registerObserver(web1);

        System.out.println("Setting price to $120.50");
        market.setStockPrice(120.50);

        System.out.println("\nSetting price to $121.00");
        market.setStockPrice(121.00);

        market.removeObserver(mobile1);

        System.out.println("\nSetting price to $122.25 (after removing Alice)");
        market.setStockPrice(122.25);
    }

}

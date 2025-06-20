package com.adapter.example;

public class PayPalAdapter implements PaymentProcessor {
	private PayPalGateway payPalGateway;
	
	public PayPalAdapter(PayPalGateway gateway) {
		this.payPalGateway=gateway;
	}

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		payPalGateway.sendMoney(amount);

	}

}

package com.adapter.example;

public class StripeAdapter implements PaymentProcessor {
	private StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway gateway) {
        this.stripeGateway = gateway;
    }
	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		stripeGateway.makePayment(amount);

	}

}

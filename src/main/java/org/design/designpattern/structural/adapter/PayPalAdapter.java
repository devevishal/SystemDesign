package org.design.designpattern.structural.adapter;

public class PayPalAdapter implements PaymentGateway{

    private PayPal paypal;

    public PayPalAdapter(PayPal payPal) {
        this.paypal = payPal;
    }

    @Override
    public void processPayment(double amount) {
        paypal.makePayment(amount);
    }
}

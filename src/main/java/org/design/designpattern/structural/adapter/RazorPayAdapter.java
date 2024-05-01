package org.design.designpattern.structural.adapter;

public class RazorPayAdapter implements PaymentGateway {


    private RazorPay razorPay;

    public RazorPayAdapter(RazorPay razorPay){
        this.razorPay = razorPay;
    }

    @Override
    public void processPayment(double amount) {
        razorPay.pay(amount);
    }
}

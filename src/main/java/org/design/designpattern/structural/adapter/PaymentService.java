package org.design.designpattern.structural.adapter;

public class PaymentService {

    public static void main(String[] args) {

        PaymentGateway payPalGateway = new PayPalAdapter(new PayPal());
        PaymentGateway razorPayGateway = new RazorPayAdapter(new RazorPay());

        payPalGateway.processPayment(100);
        razorPayGateway.processPayment(50);

    }
}

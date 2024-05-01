package org.design.designpattern.structural.adapter;

public class PayPal {

    public void makePayment(double amount) {
        System.out.println("PayPal: Processing payment of " + amount);
    }
}

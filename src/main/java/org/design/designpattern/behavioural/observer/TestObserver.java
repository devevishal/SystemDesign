package org.design.designpattern.behavioural.observer;

public class TestObserver {

    public static void main(String[] args) {
        OrderingSystem orderingSystem = new OrderingSystem();

        EmailService emailService = new EmailService();
        StockService stockService = new StockService();

        orderingSystem.subscribe(emailService);
        orderingSystem.subscribe(stockService);
        orderingSystem.unsubscribe(emailService);

        orderingSystem.notifySubscriber();


    }
}

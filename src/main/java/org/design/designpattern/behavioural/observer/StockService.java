package org.design.designpattern.behavioural.observer;

public class StockService implements Subscriber{

    @Override
    public void notify(String message) {
        System.out.println(" StockService:"+message);
    }
}

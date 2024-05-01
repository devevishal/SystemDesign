package org.design.designpattern.behavioural.observer;

import java.util.HashSet;
import java.util.Set;

public class OrderingSystem implements Publisher{

    private Set<Subscriber> subscribers = new HashSet<>();

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber() {
        for(Subscriber subscriber : subscribers){
            subscriber.notify("Order placed successfully");
        }

    }
}

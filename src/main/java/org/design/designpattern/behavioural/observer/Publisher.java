package org.design.designpattern.behavioural.observer;

public interface Publisher {

    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscriber();
}

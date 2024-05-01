package org.design.designpattern.behavioural.observer;

public class EmailService implements Subscriber{

    @Override
    public void notify(String message) {
       System.out.println("EmailService: "+message);
    }
}

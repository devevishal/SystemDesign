package org.design.designpattern.creational.factory.abstractFactory;

public class WindowOSButton implements Button{

    @Override
    public void paint() {
        System.out.println("WindowOSButton");
    }
}

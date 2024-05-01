package org.design.designpattern.factory.abstractFactory;

public class WindowOSButton implements Button{

    @Override
    public void paint() {
        System.out.println("WindowOSButton");
    }
}

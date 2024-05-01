package org.design.designpattern.creational.factory.abstractFactory;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton");
    }
}

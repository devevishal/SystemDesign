package org.design.designpattern.creational.factory.abstractFactory;

public class WindowOSCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("WindowOSCheckBox");
    }
}

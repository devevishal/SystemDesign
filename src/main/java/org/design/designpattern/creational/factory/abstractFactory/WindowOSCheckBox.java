package org.design.designpattern.factory.abstractFactory;

public class WindowOSCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("WindowOSCheckBox");
    }
}

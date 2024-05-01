package org.design.designpattern.creational.factory.abstractFactory;

public class MacOsCheckBox implements CheckBox{
    @Override
    public void paint() {

        System.out.println("I am a MacOs CheckBox");
    }
}

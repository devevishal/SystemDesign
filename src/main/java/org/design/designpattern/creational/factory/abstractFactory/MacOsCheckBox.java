package org.design.designpattern.factory.abstractFactory;

public class MacOsCheckBox implements CheckBox{
    @Override
    public void paint() {

        System.out.println("I am a MacOs CheckBox");
    }
}

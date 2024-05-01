package org.design.designpattern.creational.factory.abstractFactory;

public class WidowOsFactory implements GuiFactory{

    @Override
    public Button createButton() {
        return new WindowOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowOSCheckBox();
    }
}

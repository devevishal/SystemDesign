package org.design.designpattern.factory.abstractFactory;

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

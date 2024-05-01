package org.design.designpattern.factory.abstractFactory;

public class MacOsFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOsCheckBox();
    }

}

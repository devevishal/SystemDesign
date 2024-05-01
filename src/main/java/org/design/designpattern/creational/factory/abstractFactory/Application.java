package org.design.designpattern.creational.factory.abstractFactory;

public class Application {
    public static void main(String[] args) {
        String osName = "mac";
        GuiFactory guiFactory;
        if(osName.equals("mac")){
            guiFactory = new MacOsFactory();
        }else{
            guiFactory = new WidowOsFactory();
        }

        guiFactory.createCheckBox().paint();

    }
}

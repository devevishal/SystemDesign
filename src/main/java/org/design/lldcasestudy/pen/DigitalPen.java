package org.design.lldcasestudy.pen;

public class DigitalPen implements Pen {


    @Override
    public void write() {
        System.out.println("I am a digital pen");
    }

    @Override
    public String colour() {
        return "blue";
    }
}

package org.design.lldcasestudy.pen;

public class FountainPen implements Pen {
    @Override
    public void write() {
        System.out.println("Writing with Fountain Pen");
    }

    @Override
    public String colour() {
        return "";
    }
}

package org.design.designpattern.structural.decorator;

public class PlainPizza implements Pizza {




    @Override
    public double getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }
}

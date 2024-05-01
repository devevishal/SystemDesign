package org.design.designpattern.structural.decorator;

public class Cheese extends ToppingDecorator {

    public Cheese(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 20;
    }
}

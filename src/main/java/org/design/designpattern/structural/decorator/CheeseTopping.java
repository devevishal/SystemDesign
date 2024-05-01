package org.design.designpattern.structural.decorator;

public class CheeseTopping extends ToppingDecorator {

    public CheeseTopping(ToppingDecorator newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 20;
    }
}

package org.design.designpattern.structural.decorator;

public class TomatoTopping extends ToppingDecorator {


    public TomatoTopping(Pizza pizza) {
        super(pizza);
    }


    @Override
    public double getCost() {
        return pizza.getCost() + 50;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Tomato";
    }
}

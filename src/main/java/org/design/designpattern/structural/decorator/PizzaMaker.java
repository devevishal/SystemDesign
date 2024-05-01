package org.design.designpattern.structural.decorator;

public class PizzaMaker {

    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza = new TomatoTopping(pizza);  // tomato can be added to base
        // pizza = new CheeseTopping(pizza); .. chese cannot be added on top of tomato
        System.out.println(pizza.getDescription() + " costs $" + pizza.getCost());
    }
}

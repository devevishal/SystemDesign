package org.design.designpattern.creational.factory.factoryMethod;

public abstract class Plan {

    public abstract double getRate();

    public double calculateBill(int units){
        return units * getRate();
    }

}

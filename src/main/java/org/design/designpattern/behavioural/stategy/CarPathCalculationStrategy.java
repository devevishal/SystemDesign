package org.design.designpattern.behavioural.stategy;

public class CarPathCalculationStrategy implements PathCalculationStrategy {
    @Override
    public void calculatePath(String from, String to) {
      System.out.println("Calculating path for car from " + from + " to " + to);
    }
}

package org.design.designpattern.behavioural.stategy;

public class BikePathCalculationStrategy implements PathCalculationStrategy {

    @Override
    public void calculatePath(String from, String to) {
        System.out.println("Calculating bike path from "+from+" to "+to);
    }
}

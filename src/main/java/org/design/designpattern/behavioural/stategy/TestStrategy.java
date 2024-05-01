package org.design.designpattern.behavioural.stategy;

public class TestStrategy {

    public static void main(String[] args) {
        GoogleMap googleMap = new GoogleMap(new BikePathCalculationStrategy());
        googleMap.calculatePath("Delhi", "Mumbai");
    }
}

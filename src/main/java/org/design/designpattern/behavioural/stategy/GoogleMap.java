package org.design.designpattern.behavioural.stategy;

public class GoogleMap {

    PathCalculationStrategy pathCalculationStrategy;

    public GoogleMap(PathCalculationStrategy pathCalculationStrategy) {
        this.pathCalculationStrategy = pathCalculationStrategy;
    }

    public void calculatePath(String from, String to) {
        pathCalculationStrategy.calculatePath(from, to);
    }

}

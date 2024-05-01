package org.design.designpattern.factory.factoryMethod;

public class GenerateBill {

    public static void main(String[] args) {

        PlanFactory planFactory = new PlanFactory();
        Plan plan = planFactory.getPlan(PlanType.COMMERCIAL);
        System.out.println(plan.calculateBill(2));
    }
}

package org.design.designpattern.factory.factoryMethod;

import java.security.InvalidParameterException;

public class PlanFactory {
    public Plan getPlan(PlanType planType) throws InvalidParameterException {
        switch (planType) {
            case DOMESTIC:
                return new DomesticPlan();
            case COMMERCIAL:
                return new CommercialPlan();
            case INSTITUTIONAL:
                return new InstitutionalPlan();
            default:
                throw new InvalidParameterException("Invalid plan type");
        }
    }


}

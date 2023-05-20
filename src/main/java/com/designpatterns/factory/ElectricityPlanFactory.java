package com.designpatterns.factory;

import com.designpatterns.factory.enums.PlanType;
import com.designpatterns.factory.plans.CommercialPlan;
import com.designpatterns.factory.plans.DomesticPlan;
import com.designpatterns.factory.plans.InstitutionalPlan;

public final class ElectricityPlanFactory {

    public static ElectricityPlan getPlan(PlanType planType){
        switch (planType){
            case DOMESTIC:
                return new DomesticPlan();
            case COMMERCIAL:
                return new CommercialPlan();
            case INSTITUTIONAL:
                return new InstitutionalPlan();
        };
        throw new IllegalArgumentException("Invalid planType.");
    }
}

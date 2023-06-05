package com.designpatterns.prototype;

import com.designpatterns.prototype.enums.PlanType;
import com.designpatterns.prototype.plans.CommercialPlan;
import com.designpatterns.prototype.plans.DomesticPlan;
import com.designpatterns.prototype.plans.InstitutionalPlan;

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

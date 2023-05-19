package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.enums.ElectricityPlanFactoryType;
import com.designpatterns.abstractfactory.enums.PlanType;
import com.designpatterns.abstractfactory.plans.UrbanCommercialPlan;
import com.designpatterns.abstractfactory.plans.UrbanDomesticPlan;
import com.designpatterns.abstractfactory.plans.UrbanInstitutionalPlan;

public final class UrbanElectricityPlanFactory extends ElectricityPlanFactory{

    public static final ElectricityPlanFactoryType planFactoryType = ElectricityPlanFactoryType.URBAN;
    @Override
    protected ElectricityPlan getPlan(PlanType planType){
        switch (planType){
            case DOMESTIC:
                return new UrbanDomesticPlan();
            case COMMERERCIAL:
                return new UrbanCommercialPlan();
            case INSTITUTIONAL:
                return new UrbanInstitutionalPlan();
        };
        throw new IllegalArgumentException("Invalid planType.");
    }
}

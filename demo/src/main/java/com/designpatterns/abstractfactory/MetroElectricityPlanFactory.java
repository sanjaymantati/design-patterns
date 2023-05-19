package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.enums.ElectricityPlanFactoryType;
import com.designpatterns.abstractfactory.enums.PlanType;
import com.designpatterns.abstractfactory.plans.MetroCommercialPlan;
import com.designpatterns.abstractfactory.plans.MetroDomesticPlan;
import com.designpatterns.abstractfactory.plans.MetroInstitutionalPlan;

public final class MetroElectricityPlanFactory extends ElectricityPlanFactory {

    public static final ElectricityPlanFactoryType planFactoryType = ElectricityPlanFactoryType.METRO;


    @Override
    protected ElectricityPlan getPlan(PlanType planType) {
        switch (planType) {
            case DOMESTIC:
                return new MetroDomesticPlan();
            case COMMERERCIAL:
                return new MetroCommercialPlan();
            case INSTITUTIONAL:
                return new MetroInstitutionalPlan();
        }
        throw new IllegalArgumentException("Invalid planType.");
    }
}

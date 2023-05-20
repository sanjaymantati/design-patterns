package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.enums.RegionTypes;
import com.designpatterns.abstractfactory.enums.PlanType;

public class Driver {

    public static void main(String[] args) {
        ElectricityPlan plan = FactoryProducer.getElectricityPlanFactory(RegionTypes.URBAN)
                .getPlan(PlanType.DOMESTIC);
        plan.calculateBill(200);
    }
}

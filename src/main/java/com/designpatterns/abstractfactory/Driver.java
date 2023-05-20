package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.enums.ElectricityPlanFactoryType;
import com.designpatterns.abstractfactory.enums.PlanType;

public class Driver {

    public static void main(String[] args) {
        ElectricityPlan plan = FactoryProducer.getElectricityPlanFactory(ElectricityPlanFactoryType.URBAN)
                .getPlan(PlanType.DOMESTIC);
        plan.calculateBill(200);
    }
}

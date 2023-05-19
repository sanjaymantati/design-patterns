package com.designpatterns.factory;

import com.designpatterns.factory.enums.PlanType;

public class Driver {

    public static void main(String[] args) {
        ElectricityPlan plan = ElectricityPlanFactory.getPlan(PlanType.INSTITUTIONAL);
        plan.calculateBill(200);
    }
}

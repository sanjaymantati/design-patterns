package com.designpatterns.prototype;

import com.designpatterns.prototype.enums.PlanType;

public class Driver {

    public static void main(String[] args) {

        ElectricityPlan plan = PlanRegistry.getPlan(PlanType.INSTITUTIONAL);
        plan.calculateBill(200);
        ElectricityPlan clonedPlan = plan.clone();
        clonedPlan.calculateBill(500);

    }
}

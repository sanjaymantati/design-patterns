package com.designpatterns.factory.plans;

import com.designpatterns.factory.ElectricityPlan;
import com.designpatterns.factory.enums.PlanType;

public final class DomesticPlan implements ElectricityPlan {
    protected double ratePerUnit = 2.5;
    private  final PlanType planType = PlanType.DOMESTIC;

    public  PlanType getPlanType() {
        return planType;
    }

    @Override
    public double getRate() {
        return ratePerUnit;
    }

    @Override
    public void calculateBill(int units) {
        double amount = units * ratePerUnit;
        System.out.printf("======= %s Plan =======%n", planType);
        System.out.printf("Rate per Unit : %.2f%n", ratePerUnit);
        System.out.printf("Total units : %d%n", units);
        System.out.println("--------------------------");
        System.out.printf("Amount : %.2f Rs%n", amount);
    }
}

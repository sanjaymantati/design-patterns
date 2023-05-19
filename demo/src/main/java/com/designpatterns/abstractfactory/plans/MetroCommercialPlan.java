package com.designpatterns.abstractfactory.plans;

import com.designpatterns.abstractfactory.MetroElectricityPlan;
import com.designpatterns.abstractfactory.enums.PlanType;

public final class MetroCommercialPlan implements MetroElectricityPlan {
    private final double ratePerUnit = 5;
    private  final PlanType planType = PlanType.COMMERERCIAL;

    public PlanType getPlanType() {
        return planType;
    }

    @Override
    public double getRate() {
        return ratePerUnit;
    }

    @Override
    public void calculateBill(int units) {
        double amount = units * ratePerUnit;
        System.out.printf("======= %s Plan (%s) =======%n", getPlanType(), getLocation());
        System.out.printf("Rate per Unit : %.2f%n", ratePerUnit);
        System.out.printf("Total units : %d%n", units);
        System.out.println("--------------------------");
        System.out.printf("Amount : %.2f Rs%n", amount);
    }
}

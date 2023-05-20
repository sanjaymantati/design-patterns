package com.designpatterns.abstractfactory.plans;

import com.designpatterns.abstractfactory.UrbanElectricityPlan;
import com.designpatterns.abstractfactory.enums.PlanType;

public final class UrbanCommercialPlan implements UrbanElectricityPlan {
    private final double ratePerUnit = 5;
    private final int freeUnits = 70;
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
        int chargeableUnit = Math.max(units - getFreeUnits(), 0);
        double amount = chargeableUnit * getRate();
        System.out.printf("======= %s Plan (%s) =======%n", getPlanType(), getLocation());
        System.out.printf("Rate per Unit : %.2f%n", getRate());
        System.out.printf("Total units : %d%n", units);
        System.out.printf("Free units : %d%n", getFreeUnits());
        System.out.printf("Total chargeable units : %d%n", chargeableUnit);
        System.out.println("--------------------------");
        System.out.printf("Amount : %.2f Rs%n", amount);
    }


    @Override
    public int getFreeUnits() {
        return freeUnits;
    }
}

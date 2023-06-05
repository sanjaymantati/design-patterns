package com.designpatterns.prototype.plans;

import com.designpatterns.prototype.ElectricityPlan;
import com.designpatterns.prototype.enums.PlanType;

public final class CommercialPlan implements ElectricityPlan {
    private double ratePerUnit = 5;
    private Integer units;
    private final PlanType planType = PlanType.COMMERCIAL;

    public PlanType getPlanType() {
        return planType;
    }

    @Override
    public double getRate() {
        return ratePerUnit;
    }

    @Override
    public void calculateBill(int reqUnits) {
        this.units = reqUnits;
        double amount = units * ratePerUnit;
        System.out.printf("======= %s Plan =======%n", planType);
        System.out.printf("Rate per Unit : %.2f%n", ratePerUnit);
        System.out.printf("Total units : %d%n", units);
        System.out.println("--------------------------");
        System.out.printf("Amount : %.2f Rs%n", amount);
    }

    @Override
    public CommercialPlan clone() {
        CommercialPlan plan = new CommercialPlan();
        plan.ratePerUnit = this.ratePerUnit;
        plan.units = this.units;
        return plan;
    }
}

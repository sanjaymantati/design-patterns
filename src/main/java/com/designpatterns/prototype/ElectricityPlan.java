package com.designpatterns.prototype;

import com.designpatterns.prototype.enums.PlanType;
import com.designpatterns.prototype.plans.CommercialPlan;

public interface ElectricityPlan extends Cloneable {

    PlanType getPlanType();

    double getRate();

    void calculateBill(int units);

     ElectricityPlan clone();
}

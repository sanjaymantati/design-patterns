package com.designpatterns.factory;

import com.designpatterns.factory.enums.PlanType;

public interface ElectricityPlan {

    PlanType getPlanType();

    double getRate();

    void calculateBill(int units);


}

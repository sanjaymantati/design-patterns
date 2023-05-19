package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.enums.PlanType;

public interface ElectricityPlan {

    PlanType getPlanType();

    double getRate();

    void calculateBill(int units);

    String getLocation();
}

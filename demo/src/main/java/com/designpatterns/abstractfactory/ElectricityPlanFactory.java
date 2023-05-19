package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.enums.PlanType;

public abstract class ElectricityPlanFactory {

    abstract ElectricityPlan getPlan(PlanType planType);


}

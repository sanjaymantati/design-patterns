package com.designpatterns.abstractfactory;


public abstract class UrbanElectricityPlan implements ElectricityPlan {
    String location = "Urban";

    @Override
    public String getLocation() {
        return location;
    }

    protected abstract int getFreeUnits();



}


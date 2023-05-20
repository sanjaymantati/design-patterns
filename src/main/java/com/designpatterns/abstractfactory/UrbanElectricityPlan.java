package com.designpatterns.abstractfactory;


public interface UrbanElectricityPlan extends ElectricityPlan {
    String location = "Urban";

    @Override
    default String getLocation() {
        return location;
    }

    int getFreeUnits();


}


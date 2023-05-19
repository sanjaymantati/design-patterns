package com.designpatterns.abstractfactory;

public interface MetroElectricityPlan extends ElectricityPlan {

    String location = "Metro";
    @Override
    default String getLocation(){
        return location;
    }
}

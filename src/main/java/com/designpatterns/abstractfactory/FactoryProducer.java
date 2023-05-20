package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.enums.RegionTypes;

public class FactoryProducer {


    public static ElectricityPlanFactory getElectricityPlanFactory(RegionTypes planFactoryType){

        switch (planFactoryType){
            case METRO:
                return new MetroElectricityPlanFactory();
            case URBAN:
                return new UrbanElectricityPlanFactory();
        };
        throw new IllegalArgumentException("Invalid Plan factory type.");

    }
}

package com.designpatterns.prototype;

import com.designpatterns.prototype.enums.PlanType;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class PlanRegistry {

    private static final PlanRegistry registry = null;
    private static final Map<PlanType, ElectricityPlan> planMap = new ConcurrentHashMap<>();

    private PlanRegistry(){

    }


    static {
        for (PlanType type : PlanType.values()) {
            planMap.put(type, ElectricityPlanFactory.getPlan(type));
        }
    }

    public static ElectricityPlan getPlan(PlanType type){
        return planMap.get(type).clone();
    }
}

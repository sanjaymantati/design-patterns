## Prototype Method
1. Type : **Creational Design pattern**
2. Definition : A prototype method is a creation design pattern that lets you create a clone/copy of object.    

## Brief
* Usually, a complex object is created by factory/builder patterns. And creating that complex object can be expensive (In terms of time). So, we can implement the prototype design pattern from which we can create copy of the complex object without using its factory/builder interface.

## Our use case

![Electricity plan](https://github.com/sanjaymantati/design-patterns/blob/master/docs/prototype/ElectricityPlan.png?raw=true)

1. Our use case is to produce electricity bills based on plans.
2. Now There are three electricity plans : Commercial, Domestic, and Institutional. Each have different rate/unit values.
3. These plans will take number of units as an input and will produce bills.
4. You can see that the Electricity plan `interface` has three implementations DomesticPlan, InstitutionalPlan, and CommercialPlan.
5. Now we can create objects of these concrete plans directly with `new` keyword. But the complexity of the creation of these plans will be increased with time which make codes hard to maintain it. So we need to detach the creational code of these plans.
6. The `ElectricityPlanFactory` Class does the creational job for all plans. We just need to provide plan type (**PlanType** enum). Now We can create any kind of plan through ElectricityPlanFactor class at anywhere without worrying about how these plans are created. 
7. Now, we have `PlanRegistry` class that create each type of Plan based on `PlanType` enum with the help of `ElectricityPlanFactory` class and store them during it's loading process in JVM.
8. So, whenever any kind of ElectricityPlan is demanded, we can use PlanRegistry class and get a copy of demanded ElectricityPlan.
9. After getting the `ElectricityPlan` object, If we need one more `ElectricityPlan` object with same type and configuration, we can just `clone()` method of `ElectricityPlan` object.


## Pros
* Can create a copy/clone object where object creating process is expensive.
* Can be used as immutable object.
* Can be used to track states of the system.

## Cons
* Does not work well with object that have circular references.


## References
1. https://refactoring.guru/design-patterns/prototype
2. **Head First Design Patterns** A Book by Kathy Sierra
## Factory Method
1. Type : **Creational Design pattern**
2. Definition : A factory method is a creation design pattern that provides an interface that creates and provide complex objects. Instead of creating these complex objects with `new` keyword, the interface (Factory class) will be used.    

## Brief
* The Factory Method design pattern is a creational design pattern that provides an interface for creating objects, but allows subclasses to decide which class to instantiate. It is also known as the **Virtual Constructor pattern**.
* The main idea behind the Factory Method pattern is to encapsulate object creation in a separate method or factory class, rather than directly instantiating objects using the `new` keyword. This method or class, known as the factory method, defines an interface or abstract class for creating objects, but the concrete implementation is deferred to subclasses.

## Our use case

![Electricity plan](https://github.com/sanjaymantati/design-patterns/blob/master/src/docs/factory/ElectricityPlan.png?raw=true)

1. Our use case is to produce electricity bills based on plans.
2. Now There are three electricity plans : Commercial, Domestic, and Institutional. Each have different rate/unit values.
3. These plans will take number of units as an input and will produce bills.
4. You can see that the Electricity plan `interface` has three implementations DomesticPlan, InstitutionalPlan, and CommercialPlan.
5. Now we can create objects of these concrete plans directly with `new` keyword. But the complexity of the creation of these plans will be increased with time which make codes hard to maintain it. So we need to detach the creational code of these plans.
6. The `ElectricityPlanFactor` Class does the creational job for all plans. We just need to provide plan type (**PlanType** enum). Now We can create any kind of plan through ElectricityPlanFactor class at anywhere without worrying about how these plans are created. Note 
7. Adding new ElectricityPlan : We can just implement the ElectricityPlan and create new Plan and add its creation logic in the `ElectricityPlanFactor` Class.
8. Changes in creation logic in existing plans : If the creational logic of any plan changes in the future, we just need to update creation code of the plan in ElectricityPlanFactor class.


## Pros
* Encapsulation of object creation: The creation logic is encapsulated within the factory method or factory class, making it easy to modify or extend the creation process without affecting client code.
* Subclass flexibility: Subclasses can override the factory method to provide specialized implementation or return different types of products, allowing for variations in object creation.
* Dependency inversion: Client code depends on the abstract creator interface or class, rather than directly depending on concrete classes (ElectricityPlan), promoting decoupling and flexibility. The Factory Method pattern is commonly used in scenarios where object creation requires complex logic, such as when creating objects based on configuration settings, dynamically loading classes, or supporting multiple  variations.

## Cons
* The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern. The best case scenario is when you’re introducing the pattern into an existing hierarchy of creator classes.


## References
1. https://refactoring.guru/design-patterns/factory-method
2. **Head First Design Patterns** A Book by Kathy Sierra
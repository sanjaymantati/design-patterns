## Abstract Factory Method
1. Type : **Creational Design pattern**
2. Definition : Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.

## Brief
* The main idea behind the abstract factory Method pattern is to encapsulate object creation in a separate method or factory class, rather than directly instantiating objects using the `new` keyword. This method or class, known as the factory method, defines an interface or abstract class for creating objects, but the concrete implementation is deferred to subclasses.

## Our use case

![Electricity plan](https://github.com/sanjaymantati/design-patterns/blob/master/docs/abstract-factory/ElectricityPlan.png?raw=true)

1. Our use case is to produce electricity bills based on plans and their region.
2. There are two area/regions : Urban and Metro.
3. In Urban area, there is **free limit on units**. So the electricity plan will work differently in comparison with metro electricity plan.
4. You can see that the Electricity plan `interface` has six implementations (3 Metro and 3 Urban) :  MetroCommercialPlan, MetroDomesticPlan, MetroInstitutionalPlan, UrbanCommercialPlan, UrbanDomesticPlan, and UrbanInstitutionalPlan.
5. These plans will take number of units as an input and will produce bills.
6. Now we can create objects of these concrete plans directly with `new` keyword. But the complexity of the creation of these plans will be increased with time which make codes hard to maintain it. So we need to detach the creational code of these plans.
7. The concrete implementations(`MetroElectricityPlanFactory` and `UrbanElectricityPlanFactory` classes) of `ElectricityPlanFactory` abstract class does the creational job. We just need to provide plan type (**PlanType** enum) and region type(**RegionTypes** enum). Now We can create any kind of plan through ElectricityPlanFactory abstract class at anywhere without worrying about how these plans are created.
8. Adding new ElectricityPlan in specific region : We can just implement the ElectricityPlan and create new Plan and add its creation logic in the respective implementation of `ElectricityPlanFactory` abstract Class based on region.
9. Adding new Region and their plans :
    * We can just implement the ElectricityPlan for new plans, 
    * create new concrete implementation `ElectricityPlanFactory` abstract Class, and add creation logics of plan in that newly created concrete implementation. 
    * Add the new concrete implementation class configuration in `ElectricityPlanFactory` abstract Class.
10. Changes in creation logic in existing plans : If the creational logic of any plan changes in the future, we just need to update creation code of in their respective region specific concrete implementation of `ElectricityPlanFactory` abstract class.


## Pros
* Abstraction and Encapsulation: The abstract design pattern promotes abstraction by defining a common interface or abstract class for a family of related objects. It encapsulates the implementation details within concrete classes, allowing the client code to interact with the objects through a unified interface.
* Flexibility and Extensibility: The pattern allows for easy addition of new classes to the family without modifying the client code. You can introduce new concrete classes that adhere to the common interface or abstract class, providing flexibility and extensibility to the codebase.
* Loose Coupling: The abstract design pattern decouples the client code from the implementation details of the concrete classes. The client code only depends on the common interface or abstract class, reducing dependencies and promoting loose coupling. This makes the codebase more maintainable and facilitates easier changes or updates in the future.
* Code Reusability: By defining a common interface or abstract class, the abstract design pattern promotes code reusability. Multiple concrete classes can implement the same interface or extend the same abstract class, enabling the reuse of code logic and reducing duplication.
* Follows Single Responsibility Principle.
* Follows Open/Closed Principle.


## Cons
* Increased Complexity: Introducing the abstract design pattern adds another layer of abstraction and indirection, which can increase the complexity of the codebase. It may require a deeper understanding of the pattern and its implementation for developers working on the code.
* Potential Performance Overhead: The abstract design pattern may introduce some performance overhead due to the use of abstraction and the need for dynamic binding during runtime. However, in most cases, the impact on performance is negligible unless the pattern is misused or applied inappropriately.
* Limited Control over Concrete Classes: Since the abstract design pattern focuses on creating objects through a common interface or abstract class, it limits direct control over the specific concrete classes. This can be a disadvantage if you require fine-grained control over the individual objects or need to access specific methods or properties unique to certain concrete classes.
* Increased Indirection: The pattern introduces an extra layer of indirection between the client code and the concrete classes. This can make the code harder to follow and debug, especially for developers who are not familiar with the pattern or the specific implementation.


## References
1. https://refactoring.guru/design-patterns/abstract-factory
2. **Head First Design Patterns** A Book by Kathy Sierra
## Factory Method

* The Factory Method design pattern is a creational design pattern that provides an interface for creating objects, but allows subclasses to decide which class to instantiate. It is also known as the Virtual Constructor pattern.
* The main idea behind the Factory Method pattern is to encapsulate object creation in a separate method or factory class, rather than directly instantiating objects using the `new` keyword. This method or class, known as the factory method, defines an interface or abstract class for creating objects, but the concrete implementation is deferred to subclasses.

Here's how the Factory Method pattern works:

1. Product and Creator hierarchy: Define an abstract class or interface for the product you want to create. This represents the common interface that all products will implement. Next, create a creator class that contains the factory method declaration. The creator class may also provide some default implementation for the product creation if necessary.
2. Concrete product and creator implementation: Implement concrete classes for the product and creator. Each concrete creator class will override the factory method to provide the specific implementation for creating the corresponding product.
3. Usage: In client code, instead of instantiating objects directly, clients call the factory method on the creator class to create the product objects. The client code works with the products through the common interface, without being aware of the specific product implementation.
The Factory Method pattern allows for loose coupling between the client code and the specific product classes. It enables extensibility by allowing new product classes to be added without modifying the existing client code. Each new product class can be accompanied by a corresponding concrete creator class.

Key benefits of using the Factory Method pattern include:
- Encapsulation of object creation: The creation logic is encapsulated within the factory method or factory class, making it easy to modify or extend the creation process without affecting client code.
- Subclass flexibility: Subclasses can override the factory method to provide specialized implementation or return different types of products, allowing for variations in object creation.
- Dependency inversion: Client code depends on the abstract creator interface or class, rather than directly depending on concrete product classes, promoting decoupling and flexibility.
The Factory Method pattern is commonly used in scenarios where object creation requires complex logic, such as when creating objects based on configuration settings, dynamically loading classes, or supporting multiple product variations.
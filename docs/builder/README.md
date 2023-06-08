## Builder Method
1. Type : **Creational Design pattern**
2. Definition : A builder method is a creation design pattern that provides a class as builder to create complex objects with multiple mandatory/optional parameters.    

## Brief
* The main idea behind the builder pattern is to encapsulate object creation in a separate class and let that class maintain the integrity, dependency of parameters that will be used to create the actual object.

## Our use case

![DataSourceBuilder](https://github.com/sanjaymantati/design-patterns/blob/master/docs/builder/DataSourceCredentails.png?raw=true)

1. Our use-case is to create an object of `DataSourceCredentials` class. And this class have some optional and some mandatory parameters.
2. Now to make sure all mandatory parameters should be given by the `Driver` class and make sure the object of `DataSourceCredentials` class is created properly, we have created `DataSourceCredentialsBuilder` class that builds object of `object of `DataSourceCredentials` class` class and maintain the integrity of parameters that'll be used in the object of `DataSourceCredentials` class.


## Pros
* Encapsulation of object creation: The creation logic is encapsulated within the builder class, making it easy to modify or extend the creation process without affecting client code.



## References
1. https://refactoring.guru/design-patterns/builder
2. **Head First Design Patterns** A Book by Kathy Sierra
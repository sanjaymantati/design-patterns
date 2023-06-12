## Adapter
1. Type : **Structural Design pattern**
2. Definition : Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.    

## Brief
* The main idea behind to use adapter is to connect two or more heterogeneous hierarchies.

## Our use case

![Authenticator](https://github.com/sanjaymantati/design-patterns/blob/master/docs/adapter/adapter.png?raw=true)


### Current situation

![Basic Authenticator](https://github.com/sanjaymantati/design-patterns/blob/master/docs/adapter/basic-authenticator.png?raw=true)

1. In the application, there is an established security mechanism that takes username and password as credentials to authenticate user.
2. In the diagram, you can see that there is one `Authenticator` interface and its one implementation `BasicAuthenticator` class.
3. This implementation do the login after validating credentials and logout after successful login.
4. In login, the authenticator will create an object of `Authentication` class and will and add it in `SecurityContext` class.
5. In logout, the authenticator just remove the object of `Authentication` class from `SecurityContext` class.
6. The use of this environment will look like below.
```java
public class Driver {

    public static void main(String[] args) {
        String username = "johndoe";
        String password = Base64.getEncoder().encodeToString(username.getBytes());
        String usernamePasswordPhrase = Base64.getEncoder().encodeToString(String.format("%s:%s", username, password).getBytes());
        Authenticator authenticator = new BasicAuthenticator();
        authenticator.login(username, Base64.getEncoder().encodeToString(username.getBytes()));
        authenticator.logout();
    }
}
```

### A New feature (Breaks everything.😢)
![Advance Authenticator](https://github.com/sanjaymantati/design-patterns/blob/master/docs/adapter/advance-authenticator.png?raw=true)

1. Now our team has decided to support token based authentication.
2. In the diagram, you can see that there is one `AdvanceAuthenticator` interface and its one implementation `BasicAdvanceAuthenticator` class.
3. This implementation do the login after validating token and logout after successful login.
4. In login, the authenticator will create an object of `Authentication` class and will and add it in `SecurityContext` class.
5. In logout, the authenticator just remove the object of `Authentication` class from `SecurityContext` class.
6. The use of this environment will look like below.

```java
public class Driver {

    public static void main(String[] args) {
        String username = "johndoe";
        String password = Base64.getEncoder().encodeToString(username.getBytes());
        String usernamePasswordPhrase = Base64.getEncoder().encodeToString(String.format("%s:%s", username, password).getBytes());

        AdvanceAuthenticator authenticationAdapter = new BasicAdvanceAuthenticator();
        authenticationAdapter.login(usernamePasswordPhrase);
        authenticationAdapter.logout();
    }
}
```

### Issue
1. Now our team has decided make token based authentication as primary authentication and also support the legacy `Authenticator` interface based authentication mechanism.
2. For new code, we can use `AdvanceAuthenticator` interface and it's implementations. But the existing code is dependent on `Authenticator` interface and these code will break. Also, these two interfaces are heterogeneous due to difference in the signature of `login` method.


### Solution
![Advance Authenticator Adapter](https://github.com/sanjaymantati/design-patterns/blob/master/docs/adapter/solution.png?raw=true)

1. To support token based authentication from legacy `Authenticator` interface, we need to create some kind of adapter that transform `Authenticator` request to `AdvanceAuthenticator`.
2. So, we have created `AdvanceAuthenticationAdapter` abstract class. This abstract class will act as adapter between `Authenticator` and `AdvanceAuthenticator`. 
3. Now each implementation of `AdvanceAuthenticationAdapter` abstract class will implement `getToken` method that convert username and password to token. And this token will be used to login and logout functionality.
4. The use of this environment will look like below.

```java
public class Driver {

    public static void main(String[] args) {
        String username = "johndoe";
        String password = Base64.getEncoder().encodeToString(username.getBytes());
        String usernamePasswordPhrase = Base64.getEncoder().encodeToString(String.format("%s:%s", username, password).getBytes());

        Authenticator adaptiveAuthenticator = new BasicAdvanceAuthenticationAdapter();
        adaptiveAuthenticator.login(username, Base64.getEncoder().encodeToString(username.getBytes()));
        adaptiveAuthenticator.logout();
    }
}
```


## Pros
* Preserves open-closed principal.
## Cons
* Now this will increase code complexity due to intruducing new abstract classes and their implementations.


## References
1. https://refactoring.guru/design-patterns/adapter
2. **Head First Design Patterns** A Book by Kathy Sierra
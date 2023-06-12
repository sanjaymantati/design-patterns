package com.designpatterns.adapter.authentication.authenticators;

import com.designpatterns.adapter.authentication.security.SecurityContext;

import java.util.Base64;
import java.util.Objects;

public class BasicAuthenticator implements Authenticator {


    @Override
    public void login(String username, String password) {
        Objects.requireNonNull(username, "Username is required.");
        Objects.requireNonNull(password, "Password is required.");
        String passwordDecoded = new String(Base64.getDecoder().decode(password.trim().getBytes()));
        if (!username.equals(passwordDecoded)) throw new IllegalArgumentException("Invalid credentials.");
        SecurityContext.setAuthentication(username);
        System.out.println("User is logged in with BasicAuthenticator.");
    }


    @Override
    public void logout() {
        SecurityContext.removeAuthentication();
        System.out.println("User is logged out with BasicAuthenticator.");
    }
}

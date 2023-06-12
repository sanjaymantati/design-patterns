package com.designpatterns.adapter.authentication.authenticators;

public interface Authenticator {
    void login(String username, String password);

    void logout();
}

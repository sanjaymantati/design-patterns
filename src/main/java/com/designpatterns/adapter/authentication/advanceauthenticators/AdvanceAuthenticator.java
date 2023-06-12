package com.designpatterns.adapter.authentication.advanceauthenticators;

public interface AdvanceAuthenticator {
    void login(String token);
    void logout();
}
